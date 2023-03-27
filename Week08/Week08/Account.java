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
        return "Name: " + firstName + " " + lastName + ", Balance: $" + balance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Account other) {
        return this.getFullName().compareTo(other.getFullName());
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John", "Doe", 500.0));
        accountList.add(new Account("Alice", "Smith", 1000.0));
        accountList.add(new Account("Bob", "Jones", 750.0));

        System.out.println("Original list:");
        for (Account account : accountList) {
            System.out.println(account.toString());
        }

        Collections.sort(accountList);

        System.out.println("Sorted by full name:");
        for (Account account : accountList) {
            System.out.println(account.toString());
        }

        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return Double.compare(account1.getBalance(), account2.getBalance());
            }
        };

        Collections.sort(accountList, balanceComparator);

        System.out.println("Sorted by balance:");
        for (Account account : accountList) {
            System.out.println(account.toString());
        }
    }
}
