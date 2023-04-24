package Week07;

import java.util.List;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public Account(String name, String password, String id, List<String> roles) {
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException {
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount exceeds balance.");
        }
        balance -= amount;
    }
}
