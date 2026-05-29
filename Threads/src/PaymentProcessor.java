import java.util.List;
import java.util.concurrent.*;

public class PaymentProcessor{
    private final ExecutorService executor = Executors.newFixedThreadPool(10);
    //non-blocking

    CompletableFuture<String> processPayment(String transactionId, Integer amount){
        return CompletableFuture.supplyAsync(() -> {
            // Simulate calling M-Pesa API
            System.out.println("Processing payment " + transactionId
                    + " on thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            return "Payment " + transactionId + " successful";
        }, executor);
    }

    //process multiple payments concurrently
    public void processMultiplePayments(){
        List<CompletableFuture<String>> futures = List.of(
                processPayment("TXN001", 500),
                processPayment("TXN002", 1500),
                processPayment("TXN003", 750)
        );
        //wait for all threads to complete
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> System.out.println("All payments processed"));
    }

}