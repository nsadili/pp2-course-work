package Week08.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Ali", "Aliyev", 300.5));
        accounts.add(new Account("Ali", "Eyvazov", 345.2));
        accounts.add(new Account("Zakir", "Gurbanov", 0));
        accounts.add(new Account("Nabi", "Safiyev", 20.2));

        System.out.println("Accounts before sorting:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        Collections.sort(accounts);
        System.out.println("\nSorting based on fullname:");
        for (Account account: accounts) {
            System.out.println(account.toString());
        }

        Collections.sort(accounts, new BalanceComparator());
        System.out.println("\nSorting based on both fullname and balance:");
        for (Account account: accounts) {
            System.out.println(account.toString());
        }
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

class BalanceComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return Double.compare(o1.getBalance(), o2.getBalance());
    }
}