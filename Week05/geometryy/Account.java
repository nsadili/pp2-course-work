package Week05.geometryy;

public class Account {
private int ID;
private double balance = 0.0;
private Customer customer;

public Account(int ID, Customer customer, double balance){   
    this.ID=ID;
    this.customer=customer;
    this.balance=balance; 
}
public Account(int ID, Customer customer){
    this.ID=ID;
    this.customer=customer;
}
public int getID(){
    return ID;
}
public Customer getCustomer(){
    return customer;
}
public double balance(){
    return balance;
}
public double setBalance(double balance){
    this.balance = balance;
}
public 
}
