
package Week08;

import Week05.Customer;
public class ListofAccount {

    private int id;
    private Customer customer;
    private double balance = 0.0;

 
    public ListofAccount(int id, Customer customer, double balance) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public ListofAccount(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return customer.toString() + "balance = $" + getBalance();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public ListofAccount deposit(double amount) {

        this.balance += amount;
        return this;
    }
    public class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
    public ListofAccount withdraw(double amount) throws InvalidAmountException {
        if (balance >= amount)
            this.balance -= amount;
        else
            throw new InvalidAmountException("Balance is not significant");
            

        return this;
    }
}