package Week07;

import java.beans.Customizer;

import javax.activity.InvalidActivityException;

public class Account {
    private int id;
    private Customizer customer;
    private double balance = 0.0;

    public Account(int id, Customizer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customizer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public Customizer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ((Object) customer).getName() + "(" + getId() + ") balance=$" + getBalance();
    }

    public Account deposit(double amount) {
        return new Account(this.id, this.customer, this.balance + amount);
    }


    public Account withdraw(double amount) throws Exception {
        if (this.balance >= amount)
            return new Account(this.id, this.customer, this.balance - amount);
        else
            throw new Exception("Amount cannot be more than the balance.");
    }
}
