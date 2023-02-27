package pw9;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {

        this.id = id;
        this.customer = customer;
        this.balance = balance;

    }

    public Account(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    public int getId() {
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
        return customer.toString() + " balance = " + String.format("%.2f", this.balance);
    }

    public Account deposit(double amount) {

        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {

        if (this.balance >= amount) {

            this.balance-=amount;

            }
            
            else {

            System.out.println("amount withdrawn exceeds the current balance!");

        }
        
        return this;
    }
    
}
