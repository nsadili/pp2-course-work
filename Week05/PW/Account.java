package Week05.PW; 

public class Account extends Customer {
    private  int id;
    private double balance;
    private Customer customer;

    public Account(double balance , int iD , Customer customer){
        super(customer.getName(), customer.getID() , customer.getGender());
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(int iD , Customer customer){
        this(0.0, iD, customer);
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
    
    public int getId() {
        return id;
    }

    public String toString() {
        return "Name" + this.getName() + "(" + this.getID() + ")" + "balance=" + this.getBalance();

    }

    public String GetCustomerName(){
        return this.getCustomer().getName();

    }
    
    public Account deposit(double amount){
        this.balance += amount;
        return this;
    } 

    public Account withdraw(double amount){
        if(balance >= amount) this.balance -= amount;
        else System.out.print("amount withdrawn exceeds the current balance!");
        return this;

    }
    

}
