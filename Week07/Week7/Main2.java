package Week7;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Withdraw amount cannot be more than the balance.");
        }
        balance -= amount;
    }
}
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}


public class Main2 {
    public static void main(String[] args) {
        Account account = new Account(100.0);
        System.out.println("Initial balance: " + account.getBalance());

        try {
            account.withdraw(50.0); // Withdraw succeeds
            System.out.println("Withdrawal of 50.0 succeeded. Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(75.0); // Withdraw fails and throws InvalidAmountException
            System.out.println("Withdrawal of 75.0 succeeded. Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage()); // Prints "Error: Withdraw amount cannot be more than the balance."
        }
    }
}
