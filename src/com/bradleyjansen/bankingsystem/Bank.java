package com.bradleyjansen.bankingsystem;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void getTransactionHistory(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        for  (Transaction transaction : account.getTransactions()) {
            System.out.printf("%s | R%.2f | %s%n",
                    transaction.getType(),
                    transaction.getAmount(),
                    transaction.getDate().format(formatter));
        }
    }

    public void createAccount(String accountNumber) {
        Account existing = getAccount(accountNumber);
        if (existing != null) {
            System.out.println("Account already exists!");
            return;
        }
        Account newAccount = new Account(accountNumber);
        accounts.add(newAccount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        account.withdraw(amount);
    }

    public void checkBalance(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist");
            return;
        }
        System.out.printf("Current Balance: R%.2f%n", account.getBalance());
    }
}
