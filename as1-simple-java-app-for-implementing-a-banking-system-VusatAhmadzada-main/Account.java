import java.math.BigDecimal;

public abstract class Account {
    protected String id;
    protected BigDecimal balance = BigDecimal.ZERO;

    public Account(String id ,BigDecimal balance) {
        this.id = Util.getRandomString();
        this.balance = balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public Account deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO)<1){
            throw new IllegalArgumentException(String.format("You can't deposit a negative amount!"));
        }
        balance = balance.add(amount);
        
        return this;
    }

    public abstract Account withdraw(BigDecimal amount);

}
