package Week07;
import java.util.Scanner;
public class Account extends Customer {
    
        private int id;
        private Customer customer;
        private double balance;
      
        public Account(int id, Customer customer, double balance){
           super(customer.getID(), customer.getName(), customer.getGender());
           this.id=id;
           this.customer=customer;
           this.balance=balance;
           
        
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
        @Override
        public String toString(){
            return "Account [ id = " + id + ", " + customer.toString() + ", balance = " + balance + "]";
        }
        public String getCustomerName(){
            return getName();
        }
        public Account deposit(double amount){
          balance=balance+amount;
          return this;
            
        }
        public Account withdraw(double amount){
            
            if(balance>amount){
                balance=balance-amount;
                System.out.println(amount+" withdrawn from the account");
                
            }
            else throw new IllegalArgumentException ("Amount withdrawn exceeds the current balance!");
            
            

            return this;
        }

        
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Customer customer=new Customer(92,"Murad Tahmazli", 'm');
            Account first=new Account(92, customer, 1000);
           
            System.out.println(first.toString());
            first.deposit(500);
            System.out.println("Your new balance: "+first.balance);
            System.out.println("Enter an amount to withdraw: ");

            try{
            
            first.withdraw(scanner.nextDouble());
            System.out.println("Your balance: "+first.balance);
            }
            catch(Exception e){
                System.err.println("Error: "+e.getMessage());
            }
        }
}
