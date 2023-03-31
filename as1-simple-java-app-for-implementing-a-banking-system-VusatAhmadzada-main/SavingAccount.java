import java.math.BigDecimal;

public class SavingAccount extends Account {
    private BigDecimal interestRate;

    public SavingAccount(String id,BigDecimal balance, BigDecimal interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public Account withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Not Enough Money!");
        }
        return this;
    }

}
