package week05;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;
    private String CustomerName;
    private double deposit;
    private double withdraw;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
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

    public String toString() {
        return String.format("%s %.2f", this.customer.toString(), this.balance);
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else System.out.println("Amount exceeds the balance");
        return this;
    }
}
