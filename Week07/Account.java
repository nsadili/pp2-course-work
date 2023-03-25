package Week07;

public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0.0;

    public Account(int ID, Customer customer, double balance) {
        setBalance(balance);
        setCustomer(customer);
        setID(ID);

    }

    public Account(int ID, Customer costumer) {
        this(ID, costumer, 0.0);
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return getCustomerName() + "(" + ID + ")"
                + " balance = $" + getBalance();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;

        } else {
            throw new InvalidAmountException("Amount withdrawn exceed the balance");
        }

        return this;
    }
}
