public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

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
        this(id, customer, 0);
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
        return customer.toString() + " balance = $" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        }
        balance -= amount;
        return this;
    }
}