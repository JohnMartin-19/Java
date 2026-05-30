
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Main{
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        List<FileProcessor> files = List.of(
                new FileProcessor("employees.csv",   200),
                new FileProcessor("transactions.csv", 500),
                new FileProcessor("accounts.json",    150),
                new FileProcessor("audit_log.txt",    300),
                new FileProcessor("reports.xml",      100)
        );

        FileProcessorService service = new FileProcessorService(3);
        System.out.println(" Processing with timing ");
        List<String> result = service.processWithTiming(files);
        result.forEach(System.out::println);
    }
}