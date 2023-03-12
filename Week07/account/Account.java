package account;
import account.*;

public class Account {
        private int id;
        private Customer customer;
        private double balance=0.0;
    
        public Account(int id,Customer customer,double balance) {
            this.customer=customer;
            this.id=id;
            this.balance=balance;
        }
    
        public Account(int id, Customer customer) {
            this.id=id;
            this.customer=customer;
        }
    
        public int Getid() {
            return this.id;
        }
    
        public Customer getCustomer() {
            return this.customer;
        }
    
        public double getBalance() {
            return this.balance;
        }
    
        public void setBalance(double balance) {
            this.balance=balance;
        }
    
        public String toString() {
            return String.format("%s: %.2f",this.getCustomer().getName(),this.balance);
        }
    
        public String getCustomerName() {
            return this.customer.getName();
        }
    
        public Account deposit(double amount) {
            this.balance+=amount;
            return this;
        }
    
        public Account withdraw(double amount) {
            if(balance<amount) throw new InvalidAmountException("The amount exceeds balance!");
    
            this.balance-=amount;
            
    
            return this;
        }
}
