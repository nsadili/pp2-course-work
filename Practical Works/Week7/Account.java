package Week7;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount exceeds balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
