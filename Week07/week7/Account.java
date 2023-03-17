package pp2.week7;

import java.math.BigDecimal;

public abstract class Account {
    private String id;
    protected BigDecimal balance;

    protected Account(String id) {
        this.id = id;
        this.balance = BigDecimal.ZERO;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) throws InvalidAmountException {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) throws InvalidAmountException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative");
        }
        balance = balance.add(amount);
    }

    public abstract void withdraw(BigDecimal amount) throws InvalidAmountException;
}