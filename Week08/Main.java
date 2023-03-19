package Week08;

import java.util.*;

class Account implements Comparable<Account> {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

    public int compareTo(Account other) {
        int fullnameCompare = (this.firstname + this.lastname).compareTo(other.firstname + other.lastname);
        if (fullnameCompare != 0) {
            return fullnameCompare;
        }
        else {
            return Double.compare(this.balance, other.balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("a", "a", 1500));
        accounts.add(new Account("z", "a", 2000));
        accounts.add(new Account("c", "z", 1000));
        accounts.add(new Account("b", "z", 3000));


        for (Account acc : accounts) {
            System.out.println(acc);
        }


        Collections.sort(accounts);

        System.out.println("\nSorted by fullname:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}
