package ex4;

public class Account  extends Customer  {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id  = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id  = id;
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

    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2lf", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amt) {
        balance += amt;
        return this;
    }

    public Account withdraw(double amt) throws InvalidAmountException {
        if (balance >= amt)
            balance -= amt;
        else
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        return this;
    }
}
