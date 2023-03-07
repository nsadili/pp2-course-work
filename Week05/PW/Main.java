public class Main
{
	public static void main(String[] args) {
	}
	
	class Customer{
	    private int custID;
	    private String custName;
	    private char custGender;
	    
	    public Customer(){
	        
	    }
	    public Customer(int custID, String custName, char custGender){
	        this.custID = custID;
	        this.custName = custName;
	        this.custGender = custGender;
	    }
	    
	    //Getters and Setters
	    public int getCustID(){
	        return custID;
	    }
	    public void setCustID(int custID){
	        this.custID = custID;
	    }
	    
	    public String getCustName(){
	        return custName;
	    }
	    public void setCustName(String custName){
	        this.custName = custName;
	    }
	    
	    public char getCustGender(){
	        return custGender;
	    }
	    public void setCustGender(){
	        this.custGender = custGender;
	    }
	    
	    //Methods
	    public String toString(){
	        return "Customer ID: " + custID + "/n"+"Customer Name: " + custName + "/n"+"Customer Gender: " + custGender;
	    }
	}
	    
	    
	    class Account{
	        private int accID;
	        Customer cust = new Customer();
	        private double balance = 0.0;
	        
	        public Account(int accID, Customer cust, double balance){
	            this.accID = accID;
	            this.cust= cust;
	            this.custGender = custGender;
	    }
	    
	    public int getAccID(){
	        return accID;
	    }
	    public getCustomer(){
	        return cust;
	    }
	    public double getBalance(){
	        return balance;
	    }
	    public void setBalance(balance){
	        this.balance = balance;
	    }
	    
	    public String toString(){
	        return "Account ID: " + accID + "/n"+"Balance: " + balance;
	    }
	    
	    public double deposit(double amount){
	       return setBalance(balance + amount);
	    }
	    public double withdraw(double amount){
	        if(balance >= amount) return setBalance(balance - amount);
	        else System.out.println("Amount withdrawn exceeds the current balance!");
	    }
	}
}
