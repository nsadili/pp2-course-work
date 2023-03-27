package ex;

import java.util.*;

public class ListsOfAccounts implements Comparable<ListsOfAccounts> {
    private String firstname;
    private String lastname;
    private double balance;

    public ListsOfAccounts(String firstname, String lastname, double balance) {
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

   
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    
    public int compareTo(ListsOfAccounts other) {
        String thisFullname = this.firstname + this.lastname;
        String otherFullname = other.firstname + other.lastname;
        return thisFullname.compareTo(otherFullname);
    }

    public static void main(String[] args) {
     
        List<ListsOfAccounts> accounts = new ArrayList<>();
        accounts.add(new ListsOfAccounts("John", "Doe", 1000));
        accounts.add(new ListsOfAccounts("Jane", "Doe", 500));
        accounts.add(new ListsOfAccounts("Alice", "Wonderland", 2000));

        System.out.println("Original list:");
        for (ListsOfAccounts account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);

        System.out.println("Sorted by fullname:");
        for (ListsOfAccounts account : accounts) {
            System.out.println(account);
        }

        Comparator<ListsOfAccounts> balanceComparator = Comparator.comparing(ListsOfAccounts::getBalance);
        Collections.sort(accounts, balanceComparator);

        System.out.println("Sorted by balance:");
        for (ListsOfAccounts account : accounts) {
            System.out.println(account);
        }
    }
}
