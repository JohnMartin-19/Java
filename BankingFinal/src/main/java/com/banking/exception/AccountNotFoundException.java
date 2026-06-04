package com.banking;

import java.security.auth.login.AccountNotFoundException;

public class AccoutnNotFoundException extends Exception{
    public AccountNotFoundException(String accountNumber){
        super("Account not found" + accountNumber);
    }
}