package pp2.week05;

public class Account extends Customer {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account(int id, Customer customer, double balance) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
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

    public String toString() {

        return String.format("%s balance=$%.2f", this.customer.toString(), this.balance);
    }
    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}


