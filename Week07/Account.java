public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Invalid amount. Cannot withdraw more than the balance.");
        }
        balance -= amount;
    }
}
