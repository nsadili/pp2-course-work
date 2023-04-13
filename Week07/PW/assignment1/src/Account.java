public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount cannot be greater than account balance.");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        try {
            Account account = new Account(3500);
            System.out.println("Initial balance: " + account.getBalance());

            account.withdraw(1500);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(1500);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InvalidAmountException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}