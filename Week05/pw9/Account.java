package WEEK5.pw9;

public class Account extends Customer{
    int accID;
    Customer customer;
    double balance=0.0;
    public Account(int iD, String name, String string, int accID, Customer customer, double balance) {
        super(iD, name, string);
        this.accID = accID;
        this.customer = customer;
        this.balance = balance;
    }
    public int getAccID() {
        return accID;
    }
    public void setAccID(int accID) {
        this.accID = accID;
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
    public String toString() {
        return "Account [accID=" + accID + ", customer=" + customer + ", balance=" + balance + "]";
    }
    public void deposit(double depos){
        this.setBalance(this.getBalance()+depos);
    }
    public void withdraw(double withd){
        this.setBalance(this.getBalance()-withd);
    }
}
