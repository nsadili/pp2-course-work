import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ListOfAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public void Account(String firstName, String lastName, double balance) {
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

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Doe", 1000.0));
        accounts.add(new Account("Jane", "Doe", 500.0));
        accounts.add(new Account("Bob", "Smith", 2000.0));

        System.out.println("Before sorting:");
        for (Account account : accounts) {
            System.out.println(account);
        }

        // Sort by fullname (firstname + lastname) using Comparable
        Collections.sort(accounts);

        System.out.println("After sorting by fullname");
        for (Account account : accounts) {
            System.out.println(account);
        }

        // Sort by balance using Comparator
        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getBalance(), o2.getBalance());
            }
        };

        Collections.sort(accounts, balanceComparator);

        System.out.println("After sorting by balance");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public int compareTo(Account otherAccount) {
        String thisFullName = this.firstName + this.lastName;
        String otherFullName = otherAccount.firstName + otherAccount.lastName;

        return thisFullName.compareTo(otherFullName);
    }
}
