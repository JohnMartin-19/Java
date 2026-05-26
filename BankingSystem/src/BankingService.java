import java.util.HashMap;
import java.util.Map;

public class BankingService{
    private Map<String , Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, int pin, double initialDeposit){
        if(initialDeposit < 500){
            throw new InvalidAmountException("Initial deposit cannot be less than 500 Ksh");
        }
        accounts.put(accountNumber, new Account(accountNumber,pin,initialDeposit));
    }

    public double getBalance(String accountNumber, int pin) throws InvalidAccountException, InvalidPinException{
        Account account = findAccount(accountNumber);
        verifyPin(account,pin);
        return account.getBalance();
    }

    //helper methods
    private void verifyPin(Account account,int inputPin) throws InvalidPinException{
        if(account.getPin() != inputPin){
            throw new InvalidPinException("Authentication Denied" + account.getAccountNumber());
        }
    }

    private Account findAccount(String accountNumber) throws InvalidAccountException{
        Account account = accounts.get(accountNumber);
        if(account == null){
            throw new InvalidAccountException("Account with given credentials does not exist" + accountNumber);
        }

        return account;
    }

    public void withdraw(String accountNumber, int pin ,double amount)
            throws InvalidAccountException, InvalidPinException, InsufficientBalanceException{
        if(amount <= 0 ){
            throw new InvalidAmountException("Amount cannot be zero(0)");
        }

        Account account = findAccount(accountNumber);
        verifyPin(account,pin);

        if(account.getBalance() < amount){
            throw  new InsufficientBalanceException("The account balance is too low to withdraw");
        }

        account.setBalance(account.getBalance() - amount);

    }

    public void deposit(String accountNumber, int pin, double amount) throws InvalidAccountException, InvalidPinException{
        if(amount < 0){
            throw new InvalidAmountException("The amount is too low to be deposited");
        }
        Account account = findAccount(accountNumber);
        verifyPin(account,pin);
        account.setBalance(account.getBalance() + amount);
        System.out.println("Successfully deposited" + amount + " to " + accountNumber);
    }
}