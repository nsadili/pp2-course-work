public void withdraw(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("Amount must be greater than zero");
    }
    if (amount > balance) {
        throw new InvalidAmountException("Amount exceeds current balance");
    }
    balance -= amount;
}

public static void main(String[] args) {
    Account account = new Account("12345678", 1000.0);
    try {
        account.withdraw(2000.0);
    } catch (InvalidAmountException e) {
        System.out.println("Error: " + e.getMessage());
    }
    System.out.println("Account balance: " + account.getBalance());
}
