package banksystem;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
	private BigDecimal overDraftLimit;

	public CheckingAccount(Customer customer, BigDecimal balance, BigDecimal overDraftLimit) {
		super(customer.getId());
		this.overDraftLimit = overDraftLimit;
	}

	public BigDecimal getOverDraftLimit() {
		return overDraftLimit;
	}

	@Override
	public void withdraw(BigDecimal amount) {
		BigDecimal limit = getBalance().add(overDraftLimit);
		if (amount.compareTo(limit) > 0) {
			throw new IllegalArgumentException("Withdrawal amount exceeds overdraft limit");
		}
		BigDecimal newBalance = getBalance().subtract(amount);
		setBalance(newBalance);
	}

	private void setBalance(BigDecimal newBalance) {
		super.balance = newBalance;
	}
}
