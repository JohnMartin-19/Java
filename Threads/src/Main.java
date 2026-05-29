import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;



public class Main{
    public static void main(String[] args){
        // Usage when using Extends Thread
        MyThread t1 = new MyThread("Task A");
        MyThread t2 = new MyThread("Task B");

        t1.start(); // do NOT call run() directly — that runs on main thread
        t2.start(); // these two now run concurrently

        //Usage when using Implements Runnable
        Thread t3 = new Thread(new MyTask("Task c"));
        Thread t4 = new Thread(new MyTask("Task d"));

        t3.start();
        t4.start();

        //Executor Service. - Manages the ThreadPool on your behalf,
        // just declare the number of threads you want

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(() -> System.out.println("Task 1" + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 2" + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 3" + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 4" + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 5" + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 6" + Thread.currentThread().getName()));

        //task 5&6 will wait for a free thread in order to be executed

        executor.shutdown(); // always close the resource else the JVM will not and it will eat up memory.


        //Runnable does not return a value, but callable does
        ExecutorService exec = Executors.newFixedThreadPool(4);
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        //future holds the result - will be available later
        Future<Integer> future = exec.submit(task);

        System.out.println("Doing other work while task runs...");

        //get() blocks until result is ready

        Integer result = future.get();
        System.out.println("Result" + result);

        executor.shutdown();

        //CompletableFuture - provides a non-blocking async programming
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() ->{
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){}
            return "Data from DB";
        });
    // thenApply — transform the result when it arrives (like map in streams)
        CompletableFuture<String> processed = future1
                .thenApply(data -> data.toUpperCase());
        //thenAccept - — consume the result (like forEach)
        processed.thenAccept(results -> System.out.println("Got:" + results));
        System.out.println("Main thread continues immediately ......");
        future1.join();

    }
}