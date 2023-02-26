public class Account {
    private int id;
    Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString() {
        return String.format("%s balance=%.2f", customer.toString(), balance);
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } 
        else {
            System.out.println("Not Enough Money!");
        }
        return this;
    }
}
