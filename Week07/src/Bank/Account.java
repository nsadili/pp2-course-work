package Bank;
public class Account {
    private int id;
    private double balance;
    private Customer customer;

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void withdraw(double amount) throws InvalidAmountException {
        if (balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance");
        }
    }

    @Override
    public String toString() {
        return this.customer + " balance $" + this.balance;
    }
}

 class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}
