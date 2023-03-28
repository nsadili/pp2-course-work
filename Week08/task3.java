import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account implements Comparable<Account> {
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
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Account other) {
        int result = this.firstname.compareTo(other.getFirstname());
        if (result == 0) {
            result = this.lastname.compareTo(other.getLastname());
        }
        return result;
    }
}

class BalanceComparator implements Comparator<Account> {
    @Override
    public int compare(Account a, Account b) {
        return Double.compare(a.getBalance(), b.getBalance());
    }
}

public class task3 {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Javid", "İbadov", 999999999.0));
        accounts.add(new Account("Bob", "Johnson", 2500.0));
        accounts.add(new Account("Charlie", "Williams", 10000.0));
        accounts.add(new Account("David", "Brown", 7500.0));

        System.out.println("Unsorted accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);

        System.out.println("\nAccounts sorted by fullname:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts, new BalanceComparator());

        System.out.println("\nAccounts sorted by balance:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
