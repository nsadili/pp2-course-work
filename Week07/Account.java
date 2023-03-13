package Week07;

public class Account {
   public static void main(String[] args) {
        private double balance;
    
        public Account(double initialBalance) {
            balance = initialBalance;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void deposit(double amount) {
            balance += amount;
        }
    
        public void withdraw(double amount) {
            if (amount > balance) {
                throw new IllegalArgumentException("Withdrawal amount exceeds balance.");
            }
            balance -= amount;
        }
    }
    
    
}
