package Week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListsInAction {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Vidadi", "Nabiyev", 300.5));
        accounts.add(new Account("Shukur", "Eyvazli", 345.2));
        accounts.add(new Account("Zakir", "Ashirli", 110.5));
        accounts.add(new Account("Heydar", "Aliyev", 20.2));

        System.out.println("Accounts before sorting:");
        accounts.forEach(System.out::println);

        Collections.sort(accounts);
        System.out.println("\nSorting based on fullname:");
        accounts.forEach(System.out::println);

        accounts.sort(Comparator.comparing(Account::getBalance));
        System.out.println("\nSorting based on both fullname and balance:");
        accounts.forEach(System.out::println);
    }
}

class Account implements Comparable<Account> {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return this.balance;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    @Override
    public int compareTo(Account o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}
