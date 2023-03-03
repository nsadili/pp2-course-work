package practicalwork;

public class AccountPW {
	
    private int id;
    
    private Customer customer;
    
    private double balance = 0.0;
    
    public AccountPW(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
        }
        public AccountPW(int id, Customer customer) {
        	
         this.id = id;
         this.customer = customer;
        }public int getId() {
         return this.id;
        }
        public Customer getCustomer() {
        	
        return this.customer;
        }
        public double getBalance() {
        	
        return this.balance;
        }
        public void setBalance(double balance) {
        	
            this.balance = balance;
        }
        
        @Override
        
        public String toString() {
        	
            return customer.getName() + "sad(" + getId() + "happy) balance = $" + getBalance();
        }
        public AccountPW deposit(double amount) {
        	
            return new AccountPW(this.id, this.customer, this.balance + amount);
        }
        public AccountPW withdraw(double amount) {
        	
            if(this.balance >= amount)
            	
                return new AccountPW(this.id, this.customer, this.balance + amount);
            else
            	
                System.out.println("The amount withdrawn exceeds the current balance: ");
            return this;
        }
    }