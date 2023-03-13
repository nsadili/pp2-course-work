package Week07.pw4;
import Week05.pw9.Customer;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account(int id, Customer customer, double balance){
        setBalance(balance);
        setCustomer(customer);
        setId(id);
    }
    public Account(int id, Customer customer){
        setCustomer(customer);
        setId(id);
    }

    public Account(){}

    public void setId(int id) {
        this.id = id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setBalance(double balance) {
        this.balance = balance;
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
    public String toString(){
        return String.format("%s balance: $%.2f" , customer.toString(), balance);
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        balance =+ amount;
        return this;
    }
    public Account withdraw(double amount){
        if (this.balance >= amount) balance =- amount; 
        else throw new InvalidAmountException();
        return this;
    }
}