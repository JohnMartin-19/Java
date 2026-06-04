package BankingFinal.src.main.java.com.banking.exception;


public class DuplicateAccountException extends Exception{
    public DuplicateAccountException (String accountNumber){
        super("Account already exists" + accountNumber);
    }
}