public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Invalid amount. Cannot withdraw more than the available balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
