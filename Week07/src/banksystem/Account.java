package banksystem;

import java.math.BigDecimal;

public abstract class Account {
	private String id;
	protected BigDecimal balance;

	public Account(String id) {
		this.id = id;
		this.balance = BigDecimal.ZERO;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void deposit(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		balance = balance.add(amount);
	}

	public abstract void withdraw(BigDecimal amount);
}
