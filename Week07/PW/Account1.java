package Week07.PW; 

public class Account1 extends Customer1 {
    private  int id;
    private double balance;
    private Customer1 customer;

    public Account1(double balance , int iD , Customer1 customer){
        super(customer.getName(), customer.getID() , customer.getGender());
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public Account1(int iD , Customer1 customer){
        this(0.0, iD, customer);
    }

    public Customer1 getCustomer() {
        return customer;
    }
    public void setCustomer(Customer1 customer) {
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
    
    public Account1 deposit(double amount){
        this.balance += amount;
        return this;
    } 

    public Account1 withdraw(double amount){
        if(balance >= amount) this.balance -= amount;
        else {
            InvalidAmountException err1 = new InvalidAmountException("Negative number!");
            throw err1;
            
        }
        return this;

    }
    

}
