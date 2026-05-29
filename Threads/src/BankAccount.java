import java.util.*;


public class BankAccount{
    private double balance;
    private final Object lock = new Object();

    public void transfer(double amount){
        synchronized (lock){ // only this block is locked, not the whole method
            balance -= amount;
        }
    }
}