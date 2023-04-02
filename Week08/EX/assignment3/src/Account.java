import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Account other) {
        return (firstName + lastName).compareTo(other.getFirstName() + other.getLastName());
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Vasif", "Maharramli", 1000.0));
        accountList.add(new Account("Tamerlan", "Qasimli", 2000.0));
        accountList.add(new Account("Teymur", "Hasanli", 500.0));

        System.out.println("Original List: ");
        for (Account account : accountList) {
            System.out.println(account);
        }

        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return (a1.getFirstName() + a1.getLastName())
                        .compareTo(a2.getFirstName() + a2.getLastName());
            }
        });

        System.out.println("\nSorted by Fullname using Collections.sort(): ");
        for (Account account : accountList) {
            System.out.println(account);
        }

        accountList.sort(new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return Double.compare(a1.getBalance(), a2.getBalance());
            }
        });

        System.out.println("\nSorted by Balance using List.sort(): ");
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}