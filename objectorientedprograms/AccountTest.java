package com.day7.objectorientedprograms;

class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + " to account " + accountName);
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance. Balance remains unchanged.");
        } else {
            balance -= amount;
            System.out.println("Debited $" + amount + " from account " + accountName);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("John's Account", 1000.0);
        Account account2 = new Account("Jane's Account", -500.0); // Testing with negative initial balance

        System.out.println("Initial Balances:");
        printAccountDetails(account1);
        printAccountDetails(account2);

        account1.credit(500.0);
        account2.credit(200.0);

        System.out.println("\nBalances after crediting:");
        printAccountDetails(account1);
        printAccountDetails(account2);

        account1.debit(300.0);
        account2.debit(800.0); // Testing with debit amount exceeding balance

        System.out.println("\nBalances after debiting:");
        printAccountDetails(account1);
        printAccountDetails(account2);
    }

    static void printAccountDetails(Account account) {
        System.out.println(account.getAccountName() + " Balance: $" + account.getBalance());
    }
}
