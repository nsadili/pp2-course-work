package Account;

public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;
    
    public Account(int id, Customer customer, double balance){
    this.id=id;
    this.customer=customer;
    this.balance= balance;
    }
    public Account(int id, Customer customer){
    this.id=id;
    this.customer=customer;
    
    

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
        return customer.toString()+ "balance"+ "=" + String.format("%.2f", balance);
    }
    public Account deposit(double amount){
        
            this.balance+=amount;
            return this;
        
       
           
        }
        public Account withdraw(double amount){
            if(balance>=amount){
                this.balance-=amount;
            } else {
               throw new InvalidAmountException();
            }
            return this;
        } 
}
