package ex;

import java.util.*;

public class ListsOfAction implements Comparable<ListsOfAction> {
    private String firstname;
    private String lastname;
    private double balance;

    public ListsOfAction(String firstname, String lastname, double balance) {
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
    public int compareTo(ListsOfAction other) {
        String thisFullname = this.firstname + this.lastname;
        String otherFullname = other.firstname + other.lastname;
        return thisFullname.compareTo(otherFullname);
    }

    public static void main(String[] args) {
        List<ListsOfAction> accounts = new ArrayList<>();
        accounts.add(new ListsOfAction("John", "Doe", 1000));
        accounts.add(new ListsOfAction("Jane", "Doe", 500));
        accounts.add(new ListsOfAction("Alice", "Wonderland", 2000));

        System.out.println("Original list:");
        for (ListsOfAction account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);

        System.out.println("Sorted by fullname:");
        for (ListsOfAction account : accounts) {
            System.out.println(account);
        }

        Comparator<ListsOfAction> balanceComparator = Comparator.comparing(ListsOfAction::getBalance);
        Collections.sort(accounts, balanceComparator);

        System.out.println("Sorted by balance:");
        for (ListsOfAction account : accounts) {
            System.out.println(account);
        }
    }
}
