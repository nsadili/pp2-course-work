package Week05;

public class Account extends Customer{

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Name: " + getCustomerName() + ". ID: " + getID() + ". Balance: $" + getBalance();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        return new Account(getID(), getCustomer(), this.balance + amount);
    }

    public Account withdraw(double amount) {
        if (balance >= amount)
            return new Account(getID(), getCustomer(), this.balance - amount);
        else
            System.out.println("Amount withdrawn exceeds the current balance");
        return this;
    }



}
