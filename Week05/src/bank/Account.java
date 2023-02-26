package bank;

public class Account {
    private int ID;
    private double balance;
    private Customer customer;
    public Account(int ID, double balance, Customer customer) {
        this.ID = ID;
        this.balance = balance;
        this.customer = customer;
    }
    public int getID() {
        return ID;
    }
    public double getBalance() {
        return balance;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    @Override
    public String toString() {
        return this.customer + " balance=$" + this.balance;
    }
}
