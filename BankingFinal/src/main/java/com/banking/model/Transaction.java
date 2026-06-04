package BankingFinal.src.main.java.com.banking.model;

import BankingFinal.src.main.java.com.banking.model.TransactionType;

import java.util.*;
import java.time.LocalDateTime;
public class Transaction{
    private int id;
    private String accountNumber;
    private TransactionType type;
    private double amount;
    private double balance_after;
    private String description;
    private LocalDateTime createdAt;

    //constructor without ID ofr POST request

    public Transaction(String accountNumber, TransactionType type, double amount, double balance_after, String description, LocalDateTime createdAt){
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.balance_after = balance_after;
        this.createdAt = createdAt;

    }

    //constructor with ID for GET/PUT/PATCH/DELETE
    public Transaction(int id,String accountNumber, TransactionType type, double amount, double balance_after, String description, LocalDateTime createdAt ){
        this.id = id;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.balance_after = balance_after;
        this.createdAt = createdAt;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public TransactionType getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public double getBalance_after(){
        return balance_after;
    }
    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt(){
        return  createdAt;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }
    public  void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setType(TransactionType type){
        this.type = type;
    }
    public void setAmount( double amount){
        this.amount = amount;
    }
    public void setBalance_after(double balance_after){
        this.balance_after = balance_after;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    @Override
    public String toString(){
        return String.format("[%s] %s | Amount: KES%.2f | Balance after: KES%.2f | %s",
                createdAt, type, amount, balance_after, description);
    }
}