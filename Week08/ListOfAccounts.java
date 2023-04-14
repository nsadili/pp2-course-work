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
        return firstName + " " + lastName + " - Balance: $" + balance;
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
      