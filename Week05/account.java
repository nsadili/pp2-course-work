
public class account {
    private int id;
    private Customer customer;
    private double balance;

    public account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
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
        return "Account[id=" + id + ",customer=" + customer.toString() + ",balance=" + balance + "]";
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public account deposit(double amount) {
        balance += amount;
        return this;
    }

    public account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        return this;
    }
}
