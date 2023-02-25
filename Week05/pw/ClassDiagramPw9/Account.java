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

    public Account deposit(double amount) {
        return "Amount: " + amount.deposit;
    }

    public String withdraw(double amount) {

        if (balance >= amount) 
        return (int)balance - amount;
        else
        return "amount withdrawn exceeds the current balance! ";
    }



}
