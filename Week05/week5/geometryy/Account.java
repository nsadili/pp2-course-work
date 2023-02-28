package week5.geometryy;
import  week5.geometryy.Costumer;
public class Account {
    int id;
    private double balance = 0.0;
     
    private Customer customer;
    public Account(int id, Customer customer, double balance){
       this.id = id;
       this.customer = customer;
       this.balance = balance;
    }
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    public int getID(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
     
    public String toString(){
        return String.format("%s(%d) %.2f", ((Costumer) customer).getName(), id, balance );
         // automatically turns to string 
    }

}
