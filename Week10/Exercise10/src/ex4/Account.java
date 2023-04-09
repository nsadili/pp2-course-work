package ex4;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(int i, Customer c1, double d) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public double addBalance(double amount) {
        return balance + amount;
    }

    public void withdraw(double d) {
    }
}
