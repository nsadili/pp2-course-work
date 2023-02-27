package Week05;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
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

    @Override
    public String toString() {
        return customer.getName() + "(" + getId() + ") " + "balance=$" +getBalance();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        return new Account(this.id, this.customer, this.balance + amount);
    }

    public Account withdraw(double amount){
        if(balance >= amount){ 
            return new Account(this.id, this.customer, this.balance - amount);
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
