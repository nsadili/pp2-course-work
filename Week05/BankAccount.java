package Week05;

    public class BankAccount {
        private static int numAccounts = 0; // static member to keep track of number of accounts
        private String accountNumber;
        private double balance;
        
        public BankAccount(double balance) {
            this.accountNumber = "ACC" + (++numAccounts); // generate account number
            this.balance = balance;
        }
        
        public static int getNumAccounts() {
            return numAccounts;
        }
        
        public void deposit(double amount) {
            balance += amount;
        }
        
        public void withdraw(double amount) {
            balance -= amount;
        }
        
        public double getBalance() {
            return balance;
        }
    }
    
