package Week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfAccounts {
    
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Doe", 5000));
        accounts.add(new Account("Jane", "Smith", 10000));
        accounts.add(new Account("Bob", "Johnson", 2500));
        accounts.add(new Account("Alice", "Williams", 7500));
        
        // Print original list
        System.out.println("Original list:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
        
        // Sort by full name
        Collections.sort(accounts);
        System.out.println("\nSorted by full name:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
        
        // Sort by balance
        Comparator<Account> balanceComparator = new Comparator<Account>() {
            public int compare(Account a1, Account a2) {
                return Double.compare(a1.getBalance(), a2.getBalance());
            }
        };
        Collections.sort(accounts, balanceComparator);
        System.out.println("\nSorted by balance:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}