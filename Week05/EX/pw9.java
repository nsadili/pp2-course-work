package EX;

class Customer {
    private int ID;
    private String name;
    private char gender;
    public Customer(){}
    public Customer(int ID, String name, char gender){
        setGender(gender);
        setID(ID);
        setName(name);
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
    public void setID(int iD) {
        ID = iD;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return String.format("\nCustomer name (%d): %s\n", this.ID, this.name);
    }
}

class Account extends Customer {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account(int id, Customer customer, double balance){
        setBalance(balance);
        setCustomer(customer);
        setId(id);
    }
    public Account(int id, Customer customer){
        setCustomer(customer);
        setId(id);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setBalance(double balance) {
        this.balance = balance;
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
    public String toString(){
        return String.format("\nCustomer name (%d): %s\nBalance: %.2f\n", this.id,
        this.customer.getName(), this.balance);
    }
    public String getCustomerName(){
        return this.customer.getName() + "\n";
    }
    public Account deposit(double amount){
        return new Account(this.id, this.customer, this.balance + amount);
    }
    public Account withdraw(double amount){
        if (this.balance >= amount) return new Account(this.id, this.customer, this.balance - amount);
        else System.out.println("Amount withdrawn exceeds the current balance!\n");
        return this;
    }
}

public class pw9 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(17256, "Leyla Neymat", 'f');
        Customer customer2 = new Customer(17606, "Elvin Hayatov", 'm');
        Account account1 = new Account(customer1.getID(), customer1, 100.3);
        Account account2 = new Account(customer2.getID(), customer2, 210.4);
        System.out.print(account1.toString());
        System.out.print(account2.toString());
        System.out.print(account1.getCustomerName());
        System.out.print(account2.deposit(14).toString());
        System.out.println(account1.withdraw(200));
        System.out.println(account2.withdraw(100).toString());
    }    
}