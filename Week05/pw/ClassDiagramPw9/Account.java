package ClassDiagramPw9;

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

    public int getID() {
        return id;
    }

    /*

    public void setID(int id) {
        this.id = id;
    }

    */

    public Customer getCustomer() {
        return customer;
    }

    /*

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    */

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Student ID is: " + id + ", Customer is: " + customer + ", Balance is: " + balance;
    }

    public String getCustomerName() {
        return null;                       // How to solve that ?????
    }


    
}
