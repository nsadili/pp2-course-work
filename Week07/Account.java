package Week07;

public class Account {
  
  private double balance;
  
  public Account(double balance) {
    this.balance = balance;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void deposit(double amount) {
    balance += amount;
  }
  
  public void withdraw(double amount) {
    if (amount > balance) {
      throw new InvalidAmountException("Withdrawal amount exceeds balance");
    }
    balance -= amount;
  }
  
  public static void main(String[] args) {
    try {
      Account account = new Account(100.0);
      account.withdraw(200.0);
      double balance = account.getBalance();
      System.out.printf("Balance: $%.2f%n", balance);
    } catch (InvalidAmountException e) {
      System.out.println(e.getMessage());
    }
  }
  
}

class InvalidAmountException extends RuntimeException {
  
  public InvalidAmountException(String message) {
    super(message);
  }
  
}
