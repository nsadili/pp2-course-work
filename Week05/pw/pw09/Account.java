package pw09;
public class Account {
    

    
    private int id;

    private Customer customer;

    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;


}

public Account(int id, Customer customer ){

    this (id, customer, 0.0);

}

public int getid(){
    return this.id;
}

public Customer getCustomer() {
    return this.customer;
}

public double getBalance() {
    return this.balance;
}

public void setBalance(double balance) {
    if(balance>=0){
     this.balance = balance;
    }
    else System.out.println("amount withdrawn exceeds the current balance!");
 }

 








}

