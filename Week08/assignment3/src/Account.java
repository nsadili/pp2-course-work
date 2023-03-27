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

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Account otherAccount) {
        return (this.firstName + this.lastName).compareTo(otherAccount.firstName + otherAccount.lastName);
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John", "Doe", 5000));
        accountList.add(new Account("Jane", "Doe", 7000));
        accountList.add(new Account("Michael", "Smith", 3000));
        accountList.add(new Account("Sarah", "Lee", 9000));

        System.out.println("Before sorting: ");
        for (Account account : accountList) {
            System.out.println(account);
        }

        Collections.sort(accountList);

        System.out.println("\nAfter sorting by fullname: ");
        for (Account account : accountList) {
            System.out.println(account);
        }

        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return Double.compare(account1.balance, account2.balance);
            }
        };

        Collections.sort(accountList, balanceComparator);

        System.out.println("\nAfter sorting by balance: ");
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
