package BankingFinal.src.main.java.com.banking.model;
import java.util.*;
import java.time.LocalDateTime;

public class Account{
    private int id;
    private String accountNumber;
    private String ownerName;
    private int pin;
    private double balance;
    private String accountType;
    private boolean active;
    private LocalDateTime createdAt;


    //constr without ID since its is DB generated

    public Account(String accountNumber, String ownerName, int pin, double balance,String accountType, boolean active, LocalDateTime createdAt){
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.pin = pin;
            this.balance = balance;
            this.accountType = accountType;
            this.active = active;
            this.createdAt = createdAt;
    }

    //constructor with ID for GET,UPDATE AND DELETE REQUEST

    public Account(int id, String accountNumber, String ownerName,int pin, double balance, String accountType, boolean active, LocalDateTime createdAt ){
        this.id = id;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.pin = pin;
        this.balance = balance;
        this.accountType = accountType;
        this.active = active;
        this.createdAt = createdAt;

    }

    //getters (THEY RETUN THE EXPECTED FIELD/VALUE AND THEY DO NOT TAKE ANY PARAMS

    public int getId(){
        return id;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getPin(){
        return pin;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return accountType;
    }
    public boolean isActive(){
        return active;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    //setters for only mutable fields
    //(SETTERS ARE VOID, HENCE DO NOT RETURN ANYTHING AND THEY TAKE PARAMS)

    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setActive(boolean active){
        this.active = active;
    }

    //to string method
    @Override
    public String toString(){
        return String.format("Account{number=%s, owner=%s, type=%s, balance=KES%.2f, active=%s}",
                accountNumber, ownerName, accountType, balance, active);
    }
}