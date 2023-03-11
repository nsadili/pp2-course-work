package Week07;

public class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount) throws InvalidAmountException {
        if (this.balance >= amount)
            setBalance(this.balance - amount);
        else
            throw new InvalidAmountException("Amount should not be more than balance");
    }
}
