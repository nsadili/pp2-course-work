import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() + ", Balance: $" + balance;
    }

    @Override
    public int compareTo(Account o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}

class BalanceComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        if (a1.getBalance() < a2.getBalance()) {
            return -1;
        } else if (a1.getBalance() > a2.getBalance()) {
            return 1;
        }
        return 0;
    }
}

public class ListOfAccounts {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Doe", 2000.0));
        accounts.add(new Account("Jane", "Doe", 3000.0));
        accounts.add(new Account("Adam", "Smith", 1500.0));
        accounts.add(new Account("Eve", "Smith", 2500.0));

        System.out.println("Original List:");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println();

        Collections.sort(accounts);
        System.out.println("Sorted by Full Name:");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println();

        BalanceComparator balanceComparator = new BalanceComparator();
        accounts.sort(balanceComparator);
        System.out.println("Sorted by Balance:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
