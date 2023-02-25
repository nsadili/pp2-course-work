import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
       



        Customer c1= new Customer(16086,"Ibrahim", 'm');
        Customer c2= new Customer(15076, "Arzu",'f');
        
        System.out.println("First customer: " + c1.toString());

        System.out.println("Second customer: " + c2.toString());
       
        
        Account a1= new Account(157, c1,10000.0);
        Account a2= new Account(167, c2,15000.0);
        System.out.println("The final balance after some changes: ");
        System.out.println(a1.withdraw(80).deposit(200).toString());
        System.out.println(a2.withdraw(5000).deposit(3000).toString());
  
  

     
        




        
    }
}

class  Customer{
    private int ID;
    private String name;
    private char gender;
    public Customer(int ID, String name, char gender){
        this.ID= ID;
        this.name= name;
        this.gender=gender;
    }

    public Customer(int ID,String name, int discount){
     this.ID=ID;
     this.name=name;
    



    }

    public int getID() {
        return ID;
    }


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public  String toString(){
        return name + "("+ ID+ ")";

 
    }
  

}






class Account{
    private int id;
    private Customer customer;
    private double balance=0.0;
    
    public Account(int id, Customer customer, double balance){
    this.id=id;
    this.customer=customer;
    this.balance= balance;
    }
    public Account(int id, Customer customer){
    this.id=id;
    this.customer=customer;
    
    

    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return customer.toString()+ "balance"+ "=" + String.format("%.2f", balance);
    }
    public Account deposit(double amount){
        
            this.balance+=amount;
            return this;
        
       
           
        }
        public Account withdraw(double amount){
            if(balance>=amount){
                this.balance-=amount;
            } else {
                System.out.println("amount withdrawn exceed the current balance!");
            }
            return this;
        } 
        }
    
    
    





