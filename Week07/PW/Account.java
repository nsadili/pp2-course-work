import error.InvalidAmountException;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InvalidAmountException {
        if (amount > balance) {
            throw new InvalidAmountException("Amount cannot be more than the balance.");
        }
        balance = balance - amount;
    }
}

    public static void main(String[] args) {
        try {
            Account account = new Account(100.0);
            account.withdraw(101.0);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }