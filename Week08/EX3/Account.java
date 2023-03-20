package EX3;

public class Account implements Comparable<Account> {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    private String name;
    private String surname;
    public Account(){};
    public Account(String name, String surname, double balance){
        setBalance(balance);
        setName(name);
        setSurname(surname);
    };
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
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
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
    public void withdraw(double amount){
        if (this.balance < amount) throw new InvalidAmountException();
        this.balance -= amount;
    }
    @Override
    public int compareTo(Account o) {
        int compFirstName = name.compareTo(o.name);

        if(compFirstName != 0)
            return compFirstName;

        return surname.compareTo(o.surname);
    }
}