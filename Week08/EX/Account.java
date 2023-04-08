import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account implements Comparable<Account> {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance) {
        System.out.println("a. Define a class Account.");
        System.out.println("i. Define fields: firstname and lastname of type String and balance of type double.");
        System.out.println("ii. Define constructor taking firstname, lastname and balance as input arguments resp.");
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
    public int compareTo(Account other) {
        String fullname = firstName + lastName;
        String otherFullname = other.firstName + other.lastName;
        return fullname.compareTo(otherFullname);
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        System.out.println("b. Create a list of Accounts and add some elements to it.");
        System.out.println("iii. Define toString() method.");
        accountList.add(new Account("John", "Doe", 1000));
        accountList.add(new Account("Jane", "Doe", 5000));
        accountList.add(new Account("Bob", "Smith", 2000));
        accountList.add(new Account("Alice", "Johnson", 3000));

        System.out.println("c. Print the elements.");
        for (Account account : accountList) {
            System.out.println(account);
        }

        System.out.println("d. Sort all the elements based on");
        Collections.sort(accountList);

        System.out.println("i. fullname (firstname + lastname)");
        System.out.println("\nSorted by fullname:");
        for (Account account : accountList) {
            System.out.println(account);
        }

        System.out.println("ii. balance");
        System.out.println("i. Comparable interface.");
        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return Double.compare(account1.balance, account2.balance);
            }
        };
        System.out.println("e. To sort the list of accounts try using");
        System.out.println("ii. Comparator object");
        Collections.sort(accountList, balanceComparator);

        // Print the sorted elements
        System.out.println("\nSorted by balance:");
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
