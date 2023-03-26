package pw;
public class Account {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (balance < amount) {
            throw new InvalidAmountException("Insufficient balance");
        }
        balance -= amount;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("Account[full name=%s, balance=%.2f]", getFullName(), balance);
    }
}

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }

public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account("John", "Doe", 1000.0);
            System.out.println(account);

            account.deposit(500.0);
            System.out.println(account);

            account.withdraw(2000.0); 
            System.out.println(account);

            account.withdraw(-100.0); 
            System.out.println(account);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
}
