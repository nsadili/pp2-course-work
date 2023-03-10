package Week07.pw;

import Week05.pw.Customer;

public class AccountClass {

        private int id;
        private Customer customer;
        private double balance;

    public AccountClass(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    
    public AccountClass(int id, Customer customer) {
        this(id, customer, 0.0);
    }
    
    public int getID() {
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
    
    public String toString() {
        return String.format("%s balance=$%.2f", customer.toString(), balance);
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public AccountClass deposit(double amount) {
        balance += amount;
        return this;
    }
    
    public AccountClass withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InvalidAmountException("Amount withdraw exceeds the current balance");
        }
        return this;
    }
}
