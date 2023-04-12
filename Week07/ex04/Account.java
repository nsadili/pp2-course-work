package Week07.ex04;

import java.math.BigDecimal;

public class Account {
    private int id;
    private Customer customer;
    private BigDecimal balance = new BigDecimal(0);

    public Account(int id, Customer customer, BigDecimal balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getFullName() + "(" + getId() + ")'s balance is: " + getBalance();
    }

    public Account deposit(BigDecimal amount) {
        return new Account(this.id, this.customer, this.balance.add(amount));
    }


    public Account withdraw(BigDecimal amount) throws InvalidAmountException {
        if (this.balance.compareTo(amount) >= 0)
            return new Account(this.id, this.customer, this.balance.subtract(amount));
        else
            throw new InvalidAmountException("Amount cannot be more than the balance.");
    }
}
