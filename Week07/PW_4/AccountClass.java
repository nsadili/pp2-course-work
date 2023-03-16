package Week07.PW_4;

public class AccountClass {
    class Account {
        private String accountNumber;
        private String accountHolder;
        private double balance;
    
        public Account(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
    
        public void deposit(double amount) {
            balance += amount;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public String getAccountNumber() {
            return accountNumber;
        }
    
        public String getAccountHolder() {
            return accountHolder;
        }
    
        public void withdraw(double amount) {
            if (amount > balance) {
                throw new InvalidAmountException("Withdrawal amount exceeds balance");
            }
            balance -= amount;
        }
    
        @Override
        public String toString() {
            return "Account{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", accountHolder='" + accountHolder + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
    
    class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
    
}