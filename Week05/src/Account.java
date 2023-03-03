package Week05.src;

import java.util.*;

public class Account {
    private int id;
    private double balance;
    private Customer customer;

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;

    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance");
        }
    }

    @Override
    public String toString() {
        return this.customer + " balance $" + this.balance;
    }
}
