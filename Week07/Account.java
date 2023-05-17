package Week07;



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
            throw new InvalidAmountException("Withdrawal amount exceeds the account balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }



    public static void main(String[] args) {
        Account account = new Account(1000.0);

        try {
            account.withdraw(500.0);
            account.withdraw(800.0); 
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

