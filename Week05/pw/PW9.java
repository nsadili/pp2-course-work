public class PW9 {
    public static void main(String[] args) {
        Customer customer = new Customer(123456, "CustomerName", 'g');
        System.out.println(customer.toString());
        Account account = new Account(customer.getId(), customer, 123.45);
        System.out.println(account.toString());
    }
}

class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + String.valueOf(ID) + ")";
    }
}

class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
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

    public String toString() {
        return customer.toString() + " " + "balance=$" + Math.round(balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Amount withdrawn exceeds the current balance!");
    }
}