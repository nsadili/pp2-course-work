public class Account2 {

    private int ID;
    private Customer2 customer;
    private double balance;
    

    public Account2(int ID, Customer2 customer, double balance){
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account2(int ID, Customer2 customer){
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

    public Customer2 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer2 customer) {
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

    public Account2 deposit(double amount){

        balance += amount;
        return this;
    }

    public Account2 withdraw(double amount) throws InvalidAmountException
      {
        if(this.balance < amount){
            throw new InvalidAmountException("Insufficient funds");
        }
        balance -= amount;
        return this;
    }

    
}
