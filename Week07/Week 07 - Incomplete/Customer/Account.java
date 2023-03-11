package Customer;

public class Account {
    private int id;
    private double balance;
    Customer customer;

    public Account (int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    public Account (int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer.toString()+" balance=&"+getBalance(); 
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount){
        if (this.balance>=amount) this.balance-=amount;
        else throw new InvalidAmountException("Amount cannot be more than balance.");
    }    
}
