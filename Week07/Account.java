package Week07;

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
        this.id = id;
        this.customer = customer;
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

    @Override
    public String toString() {
        return customer.getName() + "(" + getId() + ") balance=$" + getBalance();
    }

    public Account deposit(double amount) {
        return new Account(this.id, this.customer, this.balance + amount);
    }

    public Account withdraw(double amount) throws InvalidAmountException {
        if (this.balance < amount)
            throw new InvalidAmountException("Amount cannot be more than the balance.");
        else
            return new Account(this.id, this.customer, this.balance - amount);
    }
}