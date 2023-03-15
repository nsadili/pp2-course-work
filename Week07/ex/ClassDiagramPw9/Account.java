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
        return "name(ID) balance: " + this.getCustomerName() + "(" + this.getID() + ") %.2lf balance = $" + balance;
    }

    public String getCustomerName() {
        return "Name " + customer;   // How to solve that ?????
    }

    public String deposit(double amount) {  // how to make Account instead of String???
        return "Amount: " + amount + balance;
    }

    public void withdraw(double amount) { // how to make Account instead of void???

        if (balance < amount) 
            throw new InvalidAmountException("The amount cannot be more than the balance!");

        balance -= amount;
    }



}
