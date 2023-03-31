import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal overDraftLimit;

    public CheckingAccount(String id, BigDecimal balance, BigDecimal overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            if ((balance.add(overDraftLimit)).compareTo(amount) >= 0) {
                overDraftLimit = overDraftLimit.subtract(amount.subtract(balance));
                balance = balance.subtract(balance);
            } else {
                System.out.println("You are asking way too much");
            }
        }
        return this;
    }

    public BigDecimal getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(BigDecimal overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}