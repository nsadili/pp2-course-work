package Week07;

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

    public class InvalidAmountException extends Exception {
        public InvalidAmountException(String message){
           super(message);
        }
    }


    public Account withdraw(double amount) throws InvalidAmountException{
        if(balance >= amount) balance-=amount;
        else throw new InvalidAmountException("amount withdrawn exceeds the current balance!");
        Account acc= new Account(id, customer, balance);
        return acc;
    }

    public static void main(String[] args) {
        Customer cs= new Customer(6464, "Firangiz", 'f');
        Account acc= new Account(63645, cs, 6375);
        try {
            System.out.println(acc.withdraw(7656));
        } catch (InvalidAmountException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
    

