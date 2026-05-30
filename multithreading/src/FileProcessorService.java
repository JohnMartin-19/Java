import java.util.*;
import java.util.concurrent.*;

public class FileProcessorService {
    private final int threadPoolSize;

    public FileProcessorService(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    public List<String> processAllFiles(List<FileProcessor> files)
            throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);
        List<Future<String>> futures = new ArrayList<>();
        List<String> results = new ArrayList<>();

        for (FileProcessor file : files) {
            futures.add(executor.submit(file));
        }

        for (Future<String> future : futures) {
            results.add(future.get());
        }

        executor.shutdown();
        return results;
    }

    public List<String> processWithTiming(List<FileProcessor> files)
            throws InterruptedException, ExecutionException {

        long startTime = System.currentTimeMillis();
        List<String> results = processAllFiles(files);
        long concurrentTime = System.currentTimeMillis() - startTime;

        long sequentialTime = files.stream()
                .mapToLong(f -> (long) f.getRecordCount() * 10)
                .sum();

        System.out.println("\nSequential would take: " + sequentialTime + "ms");
        System.out.println("Concurrent took:       " + concurrentTime + "ms");
        System.out.println("Time saved:            " + (sequentialTime - concurrentTime) + "ms");

        return results;
    }

    public List<String> processWithTimeout(List<FileProcessor> files) {
        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);
        List<Future<String>> futures = new ArrayList<>();
        List<String> results = new ArrayList<>();

        for (FileProcessor file : files) {
            futures.add(executor.submit(file));
        }

        for (int i = 0; i < futures.size(); i++) {
            try {
                results.add(futures.get(i).get(5, TimeUnit.SECONDS));
            } catch (TimeoutException e) {
                results.add("TIMEOUT: " + files.get(i).getFileName());
            } catch (InterruptedException | ExecutionException e) {
                results.add("ERROR: " + e.getMessage());
            }
        }

        executor.shutdown();
        return results;
    }
}