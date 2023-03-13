package pp2.week03.ex03;

public class Account {
 
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0.0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount cannot be more than the balance");
        }
        this.balance -= amount;
    }
}