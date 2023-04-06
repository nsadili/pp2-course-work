public class Account {

    private int ID;
    private Customer customer;
    private double balance;
    

    public Account(int ID, Customer customer, double balance){
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer){
        // this.ID = ID;
        // this.customer = customer;
        // this.balance = 0.0;
        this(ID, customer, 0.0);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String toString(){

        return customer.toString() + "balance = " + this.balance;
    }

    public String getCustomerName(){

        return getCustomer().getName();

    
    }

    public Account deposit(double amount){

        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        balance -= amount;
        return this;
    }

    
}
