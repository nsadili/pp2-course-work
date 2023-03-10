package EX;
public class Account {
    public static void main(String[] args) throws Exception {
        Customer_Account c1 = new Customer_Account(14325, "Kyoto", 5);
        System.out.printf("ID:%d Name:%s Discount:%d\n", c1.getID(), c1.getName(), c1.getDiscount());
        System.out.println(c1.toString());
        Account c1account = new Account(14325, c1, 100);
        try {
            c1account.withdraw(100);
            System.out.println("done!");
        } catch (InvalidAmouuntException a) {
            System.out.println(a.getMessage());
        }
    }

    private int id;
    private Customer_Account customer;
    private double balance;

    public Account(int id, Customer_Account customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer_Account customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer_Account getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("%s Balance=%.2f", customer.toString(), balance);
    }

    public String customerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) throws Exception {
        if (this.balance < amount)
            throw new Exception("amount withdrawn exceeds the current balance");
        this.balance -= amount;
        return this;

    }

static class Customer_Account {

    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer_Account(int ID, String name, int discount) {
        this.ID = ID;
        this.discount = discount;
        this.name = name;
        this.gender = 'F';
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
        return String.format("%s (%d)", getName(), getID());
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDiscount() {
        return discount;
    }

}


}