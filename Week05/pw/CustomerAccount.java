public class CustomerAccount {
    public static void main(String[] args){

    }
}

class Customer{
    private int id;
    private String name;
    private char gender;
    
    Customer(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    int getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }

    char getGender(){
        return this.gender;
    }

    String ToString(){
        return this.name+"("+Integer.toString(this.id)+")";
    }
}

class Account{
    private int id;
    private Customer customer;
    private double balance=0.0;

    Account(int id, Customer customer, double balance){
        this.customer = customer;
        this.id = id;
        this.customer = customer;
    }

    Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    int getId(){
        return this.id;
    }

    Customer getCustomer(){
        return this.customer;
    }

    double getBalance(){
        return this.balance;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    String ToString(){
        return String.format("Name:%s balance=$%.2f");
    }

    String getCustomerName(){
        return this.customer.getName();
    }

    Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    Account withdraw(double amount){
        if(balance >= amount)
        this.balance -= amount;
        else
        System.out.println("amount withdrawen exceeds the balance");
        return this;
    }
}
