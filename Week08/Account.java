import java.util.*;

public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    
    public String toString() {
        return "Account [firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + "]";
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public double getBalance() {
        return balance;
    }
    

    public int compareTo(Account other) {
        return this.getFullName().compareTo(other.getFullName());
    }
    
  
    public static Comparator<Account> balanceComparator = new Comparator<Account>() {
        public int compare(Account a1, Account a2) {
            return Double.compare(a1.getBalance(), a2.getBalance());
        }
    };
    
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Doe", 1000.0));
        accounts.add(new Account("Jane", "Smith", 500.0));
        accounts.add(new Account("Bob", "Johnson", 1500.0));
        accounts.add(new Account("Alice", "Lee", 2000.0));
        
   
        System.out.println("Accounts before sorting:");
        for (Account account : accounts) {
            System.out.println(account);
        }
        
    
        Collections.sort(accounts);
        System.out.println("\nAccounts sorted by full name:");
        for (Account account : accounts) {
            System.out.println(account);
        }
        
  
        accounts.sort(balanceComparator);
        System.out.println("\nAccounts sorted by balance:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
