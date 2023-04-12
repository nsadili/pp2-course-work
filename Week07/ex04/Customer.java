package Week07.ex04;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String id;
    private String fullName;
    private List<Account> accounts = new ArrayList<Account>();

    public Customer (String id, String fullName, List<Account> accounts) {
        this.id = id;
        this.fullName = fullName;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) throws IllegalArgumentException {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        accounts.add(account);
    }
    
    public void removeAccount(Account account) throws IllegalArgumentException {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        accounts.remove(account);
    }

    public void removeAccount(int accountId) {
        Iterator<Account> iterator = accounts.iterator();

        while(iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getId() == accountId) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Account with ID " + accountId + " does not exist for customer " + id);
    }
    
    public BigDecimal getTotalBalance() {
        Iterator<Account> iterator = accounts.iterator();
        BigDecimal totalBalance = new BigDecimal(0);
        
        while(iterator.hasNext()) {
            Account account = iterator.next();
            totalBalance = totalBalance.add(account.getBalance());
        }
        
        return totalBalance;
    }
    
    public List<Account> getAccounts(String type) throws IllegalArgumentException {
        List<Account> specifiedAccounts = new ArrayList<>();
        boolean typeFound = false;
    
        for (Account account : this.accounts) {
            if (account.getClass().getSimpleName().equalsIgnoreCase(type)) {
                specifiedAccounts.add(account);
                typeFound = true;
            }
        }
    
        if (!typeFound) {
            throw new IllegalArgumentException("No accounts of type " + type + " were found");
        }
    
        return specifiedAccounts;
    }
}
