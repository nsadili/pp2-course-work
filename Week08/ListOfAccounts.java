package Week08;
import java.util.*;
public class ListOfAccounts {
        public static void main(String[] args) {
            List<Account> accounts = new ArrayList<>();
            accounts.add(new Account("Ibrahim", "Askerov", 2000.0));
            accounts.add(new Account("Ali", "Mammedov", 1500.0));
            accounts.add(new Account("Nurlan", "Heybat", 3000.0));
            accounts.add(new Account("Bahruz", "Iskardarov", 1000.0));
            System.out.println("unsorted list of accounts:| ");
            for (Account account : accounts) {
                System.out.println(account);
            }
            Collections.sort(accounts);
            System.out.println("\nsorted list of accounts based on full name (using Comparable interface):/");
            for (Account account : accounts) {
                System.out.println(account);
            }
            Comparator<Account> comparator = new Comparator<Account>() {
                @Override
                public int compare(Account a, Account b) {
                    if (a.getBalance() < b.getBalance()) {
                        return -1;
                    } else if (a.getBalance() > b.getBalance()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            };
            accounts.sort(comparator);
            System.out.println("\nSorted list of accounts based on balance (using Comparator interface with anonymous class):");
            for (Account account : accounts) {
                System.out.println(account);
            }
            BalanceComparator balanceComparator = new BalanceComparator();
            accounts.sort(balanceComparator);
            System.out.println("\nSorted list of accounts based on balance (using Comparator interface with a concrete class):");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
        static class BalanceComparator implements Comparator<Account> {
            @Override
            public int compare(Account a, Account b) {
                if (a.getBalance() < b.getBalance()) {
                    return -1;
                } else if (a.getBalance() > b.getBalance()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        static class Account implements Comparable<Account> {
            private String firstname;
            private String lastname;
            private double balance;
            public Account(String firstname, String lastname, double balance) {
                this.firstname = firstname;
                this.lastname = lastname;
                this.balance = balance;
            }
            public String getFirstname() {
                return firstname;
            }
            public String getLastname() {
                return lastname;
            }
            public double getBalance() {
                return balance;
            }
            @Override
            public String toString() {
                return firstname + " " + lastname + " (" + balance + ")";
            }
            @Override
            public int compareTo(Account other) {
                // compare based on full name (firstname + lastname)
                String fullname = firstname + lastname;
                String otherFullname = other.getFirstname() + other.getLastname();
                return fullname.compareTo(otherFullname);
            }
        }
    }





}
