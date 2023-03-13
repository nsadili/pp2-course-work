package Week07.PW;

import java.beans.Customizer;

public class Accountclass {
    private static final Customizer Customizer = null;
    private int id;
    private double balance=0.0;
    
    public void Account(int id, Customizer customer, double balance){
    this.id=id;
    this.balance= balance;
    }
    public Accountclass(int id, Customizer customer){
    this.id=id;
    
    

    }

    public int getId() {
        return id;
    }

    public Customizer getCustomer() {
        return Customizer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return Customizer.toString()+ "balance"+ "=" + String.format("%.2f", balance);
    }
    public Accountclass deposit(double amount){
        
            this.balance+=amount;
            return this;
        
       
           
        }
        public Accountclass withdraw(double amount) throws Exception{
            if(balance>=amount){
                this.balance-=amount;
            } else {
               throw new Exception();
            }
            return this;
        } 
        }
