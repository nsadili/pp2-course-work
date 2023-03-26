package Week07;
public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;
    private String CustomerName;
    private double deposit;
    private double withdraw;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {

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
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                ", CustomerName='" + CustomerName + '\'' +
                ", deposit=" + deposit +
                ", withdraw=" + withdraw +
                '}';
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) throws InvalidAmountException {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new InvalidAmountException("Amount exceeds the balance");
        }
        return this;
    }
}

