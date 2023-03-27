public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount is greater than balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100.0);
        System.out.println("Initial balance: " + account.getBalance());

        try {
            account.withdraw(50.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(100.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
