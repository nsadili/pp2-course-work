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
        return customer.getName() + "(" + id + ") balance=$" + balance;
    }

    public Account deposit(double amount) {
        double newBalance = balance + amount;
        return new Account(id, customer, newBalance);
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            double newBalance = balance - amount;
            return new Account(id, customer, newBalance);
        } else {
            System.out.println("Error: insufficient funds");
            return this;
        }
    }
}
