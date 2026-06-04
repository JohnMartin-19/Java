package BankingFinal.src.main.java.com.banking.exception;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double amount, double balance){
        super("Insufficient funds. Balance: KES" + balance + ", Required: KES" + amount);
    }
}