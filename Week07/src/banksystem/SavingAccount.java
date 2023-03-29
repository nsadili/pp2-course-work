package banksystem;

import java.math.BigDecimal;

public class SavingAccount extends Account {
	private BigDecimal interestRate;

	public SavingAccount(Customer customer, BigDecimal balance, BigDecimal interestRate) {
		super(customer.getId());
		this.interestRate = interestRate;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	@Override
	public void withdraw(BigDecimal amount) {
		if (amount.compareTo(getBalance()) > 0) {
			throw new IllegalArgumentException("Withdrawal amount exceeds account balance");
		}
		BigDecimal newBalance = getBalance().subtract(amount);
		setBalance(newBalance);
	}

	private void setBalance(BigDecimal newBalance) {
		super.balance = newBalance;
	}
}
