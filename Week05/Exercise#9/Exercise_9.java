public class Customer{
    public int ID(int x);
    public String name; 
    public char gender; 

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name; 
        this.gender = gender; 
    }

    public int getID() {
        return ID;
    }

    public String getname() {
        return name;
    }

    public char getgender() {
        return gender; 
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
             
    }

    public class Account extends Customer {
        private int id; 
        private Customer customer; 
        private double balance;
    }
 
    public Account(int id, Customer customer, double balance) {

    }

    public Account(int id, Customer customer, double balance) {
       this.id = id;
       this.customer = customer;
       this.balance = balance;
    }

    public int getID() {
        return this.id;
    }

    public String getCustomer() {
        return this.customer; 
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")" + "balance = $" + this.balance;
    }

    public String getCustomerName() {
        return this.name;
    }
  
    public double deposit(double addition) {
        double Account = balance + addition;
        return deposit;
    }

    public double withdraw(double amount) {
        if (balance >= amount)
        int Account = Account - amount;
        else
        System.out.println("amount withdrawn exceeds the current balance!");
    }

}