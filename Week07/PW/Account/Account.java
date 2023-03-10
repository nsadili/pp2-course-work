public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0; 
    
     public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
       
        this(id, customer,0.0);
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
    
    public String toString(){
        return String.format("%s, balance=$%.2f",customer,balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        this.balance +=amount;
        return this;
    }

    public Account withdraw(double amount){
        if(amount>=this.balance){
            throw new InvalidAmountException(String.format("Amount: %.2f is more than balance: %.2f", amount, this.balance));
          }
    
           this.balance-=amount;
    
            return this;
    
    }

    
}



