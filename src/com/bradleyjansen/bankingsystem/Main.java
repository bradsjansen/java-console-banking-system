package com.bradleyjansen.bankingsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Bank System");
            System.out.println("Please select your option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number");
                    String accountNumber = sc.next();
                    bank.createAccount(accountNumber);
                    break;
                case 2:
                    System.out.println("Enter Account Number");
                    accountNumber = sc.next();
                    System.out.println("Enter Amount");
                    double amount = sc.nextDouble();
                    bank.deposit(accountNumber, amount);
                    break;
                case 3:
                    System.out.println("Enter Account Number");
                    accountNumber = sc.next();
                    System.out.println("Enter Amount");
                    amount = sc.nextDouble();
                    bank.withdraw(accountNumber, amount);
                    break;
                case 4:
                    System.out.println("Enter Account Number");
                    accountNumber = sc.next();
                    bank.checkBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    sc.close();
                    return;
            }
        }
    }
}
