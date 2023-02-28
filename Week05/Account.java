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
        this.customer= customer;
    }

    public int getID(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){ 
        return  customer.toString() + "balance = $" + balance; 
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount) balance -= amount;
        else System.out.println("amount withdrawn exceeds the current balance");
    }
}
