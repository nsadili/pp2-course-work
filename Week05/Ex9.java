class Customer {
    private int ID;
    private String name;
    private char gender;


public Customer(int ID, String name, char gender) {
    this.ID = ID;
    this.name = name;
    this.gender = gender;
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

public String toString() {
    return getName()+"("+getID()+")";
}
}

class Account{
    private int id;
    private Customer customer;
    private double balance = 0.0d;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
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

    public String toString() {
        return customer.getName() + "(" + getID() + ") balance =" + getBalance();
    }

    public String getCustomerName() {
        return customer.getName();
    }
    
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("amount withdrawn exceeds the current balance!");
        return this;
    }

    }

public class Ex9 {
    public static void main(String[] args){
        Customer raiq = new Customer(17534, "Raiq", 'm');
        Account raiq1 = new Account(17534, raiq);
        raiq.toString();
        raiq1.toString();
    }
}