package com.bradleyjansen.bankingsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        balance += amount;
        Transaction newTransaction = new Transaction(LocalDateTime.now(), amount, "Deposit");
        transactions.add(newTransaction);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        Transaction newTransaction = new Transaction(LocalDateTime.now(), amount, "Withdrawal");
        transactions.add(newTransaction);
    }
}
