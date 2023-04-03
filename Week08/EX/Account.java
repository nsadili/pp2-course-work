import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account {
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("%s %s - Balance: $%.2f", firstname, lastname, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a list of accounts and add some elements to it
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Alice", "Johnson", 1000.0));
        accounts.add(new Account("Bob", "Smith", 2000.0));
        accounts.add(new Account("Charlie", "Brown", 500.0));
        accounts.add(new Account("David", "Lee", 1500.0));

        // Print the elements of the list
        System.out.println("Original list:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        // Sort based on fullname using an anonymous class
        Collections.sort(accounts, new Comparator<Account>() {
            public int compare(Account a1, Account a2) {
                String fullname1 = a1.getFirstname() + a1.getLastname();
                String fullname2 = a2.getFirstname() + a2.getLastname();
                return fullname1.compareTo(fullname2);
            }
        });
        System.out.println("\nSorted by fullname:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        // Sort based on balance using lambda expression
        accounts.sort((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        System.out.println("\nSorted by balance:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
