package pp2.week05;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("%s balance=$%.2f", this.customer.toString(), this.balance);
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount)
        {
            this.balance -= amount;
        }
        else
        {
            System.out.println("amount withdrawn exceeds account balance!");
        }
        return this;
    }
}