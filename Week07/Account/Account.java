package Week07.Account;

public class Account {
    private int id;
    private double balance = 0.0;
    private Customer customer;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + getId() + ")" + "balance = $" + getBalance();
    }

    public Account deposit(double amount) {

        this.balance += amount;

        return this;
    }

    public Account withdraw(double amount) {

        if (this.balance < amount) {
            throw new InvalidAmountException("Amount cannot be more than the balance");
        } else {
            this.balance -= amount;

        }
        return this;

    }
}
