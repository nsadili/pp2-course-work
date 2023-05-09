package Week07;

import Week05.Customer;

import java.io.IOException;

public class AccountClone {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public AccountClone(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public AccountClone(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + getId() + ") " + "balance=$" + getBalance();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public AccountClone deposit(double amount){
        return new AccountClone(this.id, this.customer, this.balance + amount);
    }

    public AccountClone withdraw(double amount)throws InvalidAmountException {
        if (this.balance >= amount)
            return new AccountClone(this.id, this.customer, this.balance - amount);
        else
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
    }
}
