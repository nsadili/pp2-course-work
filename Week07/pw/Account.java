package pw;

import java.beans.Customizer;

public class Account {
    private static final Customizer Customizer = null;
    private int id;
    private double balance = 0.0;

    public Account(int id, Customizer customer) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Customizer getCustomer() {
        return Customizer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return Customizer.toString() + "balance" + "=" + String.format("%.2f", balance);
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) throws Exception {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            throw new Exception();
        }
        return this;
    }
}
