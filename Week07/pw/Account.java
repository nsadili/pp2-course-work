public class Account {
    private int id;
   private Customer customer;
   private double balance;

   public Account(int id, Customer customer, double balance){
    this.id = id;
    this.customer = customer;
    this.balance = balance;
   }
   public Account(int id, Customer customer){
    this.id = id;
    this.customer = customer;
   }

   public int getID() {
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
 return id + customer.toString() + balance;
   }

   public String getCustomerName(){
    return customer.getName();
   }

   public Account deposit(double amount){
    balance += amount;
    return this;
   }

   public Account withdraw(double amount) throws InvalidAmountException{
    if (amount > balance){
        throw new InvalidAmountException("There is no amount in balance");
    }else{
       return this;
    }
    
   }
}
