public class W5Ex9 {
    // fields
    private int ID;
    private String name;
    private char gender;

    // constructor
    public W5Ex9(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    // getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // toString method
    public String toString() {
        return name + "(" + ID + ")";
    }
}

public class Account {
    // fields
    private int id;
    private W5Ex9 customer;
    private double balance;

    // constructor
    public Account(int id, W5Ex9 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // getters
    public int getId() {
        return id;
    }

    public W5Ex9 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    // setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    public String toString() {
        return customer.getName() + "(" + customer.getID() + ")" + " balance = $" + balance;
    }

    // additional methods
    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double addition) {
        balance += addition;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}
