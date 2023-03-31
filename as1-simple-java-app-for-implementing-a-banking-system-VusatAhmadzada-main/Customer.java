import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    protected String id;
    private String fullname;
    private List<Account> accounts;

    public Customer(String fullName) {
        this.id = Util.getRandomString();
        this.fullname = fullName;
        this.accounts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) { // I am not sure if I have done these correctly
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void removeAccount(String accountId) {
        for (var acc : accounts) {
            if (accountId.equals(acc.id)) {
                accounts.remove(acc);
                return;
            }
        }
    }

    public BigDecimal getTotalBalance() {
        BigDecimal total = BigDecimal.ZERO;
        for (var acc : accounts) {
            total = total.add(acc.balance);
        }
        return total;
    }

    public List<Account> getAccounts(String type) {
        List<Account> result = new ArrayList<>();
        for (var acc : accounts) {
            if ("checking".equals(type) && acc instanceof CheckingAccount) {
                result.add(acc);
            } else if ("saving".equals(type) && acc instanceof SavingAccount) {
                result.add(acc);
            }
        }
        return result;
    }
}
