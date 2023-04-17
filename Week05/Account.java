public class Account {
    private int id; 
    private Customer customer;
    private double balance=0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance= balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    
    public int getID() {
        return id;
    }
    
    public Customer getCustomer(){
        return customer;
    }

    
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public Account deposit(double amount) {
        balance +=amount;
        Account acc= new Account(id, customer, balance);
        return acc;
    }
     
    public String toString(){
        return String.format("%s(%d) balance= $ %f", customer.getName(), id, balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }


    public Account withdraw(double amount){
        if(balance >= amount) balance-=amount;
        else System.out.println("amount withdrawn exceeds the current balance!");
        Account acc= new Account(id, customer, balance);
        return acc;
    }

    public static void main(String[] args) {
        Customer cs= new Customer(6464, "Firangiz", 'f');
        Account acc= new Account(63645, cs, 6335475);
      System.out.println(acc.withdraw(7656));
    }
}
