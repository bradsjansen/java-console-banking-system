package com.bradleyjansen.bankingsystem;

import java.time.LocalDateTime;

public class Transaction {

    private LocalDateTime date;
    private double amount;
    private String type;

    public Transaction(LocalDateTime date, double amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
