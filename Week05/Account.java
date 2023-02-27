public class Account {
    private int id;
    private customer customer;
    private double balance;

    public Account(int id, customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0;
    }

    public int getID() {
        return id;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return customer.toString() + " balance = " + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        balance -= amount;
        return this;
    }
}