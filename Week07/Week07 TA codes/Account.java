class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}
public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double withdraw(double amount) {
        try {
            if(amount > balance) {
                throw new InvalidAmountException("invalid amount");
            }
            balance -= amount;
            return balance;
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        Account a = new Account(100);
        a.withdraw(101);
    }
}
