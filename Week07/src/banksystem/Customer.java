package banksystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String fullName;
    private List<Account> accounts;

    public Customer(String fullName) {
        this.id = "CUS" + Integer.toHexString(hashCode());
        this.fullName = fullName;
        this.accounts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void removeAccount(String accountId) {
        accounts.removeIf(account -> account.getId().equals(accountId));
    }

    public BigDecimal getTotalBalance() {
        BigDecimal total = BigDecimal.ZERO;
        for (Account account : accounts) {
           
        	total = total.add(account.getBalance());
        	
        }
        
        return total;
        
    }

    public List<Account> getAccounts(String type) {
        List<Account> typeAccounts = new ArrayList<>();
        
        for (Account account : accounts) {
            if (account.getClass().getSimpleName().equals(type)) {
        
            	typeAccounts.add(account);
            	
            }
        }
        
        return typeAccounts;
        
    }
}
