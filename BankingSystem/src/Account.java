public class Account{
    private String accountNumber;
    private int pin;
    private double balance;


    //constructor
    public Account(String accountNumber, int pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    //setters and getters

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}

