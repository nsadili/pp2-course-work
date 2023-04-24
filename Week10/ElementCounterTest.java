package Week10;

import java.util.ArrayList;
import java.util.List;

public class ElementCounterTest {
    public static void main(String[] args) {
        // Example with even integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        int evenCount = ElementCounter.countElements(integerList, n -> n % 2 == 0);
        System.out.println("Number of even integers: " + evenCount);

        // Example with palindrome strings
        List<String> stringList = new ArrayList<>();
        stringList.add("racecar");
        stringList.add("hello");
        stringList.add("world");
        stringList.add("madam");
        int palindromeCount = ElementCounter.countElements(stringList, s -> isPalindrome(s));
        System.out.println("Number of palindrome strings: " + palindromeCount);

        // Example with empty accounts
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1001, "John", 0.0));
        accountList.add(new Account(1002, "Alice", 100.0));
        accountList.add(new Account(1003, "Bob", 0.0));
        accountList.add(new Account(1004, "Eve", 50.0));
        int emptyAccountCount = ElementCounter.countElements(accountList, a -> a.getBalance() == 0.0);
        System.out.println("Number of empty accounts: " + emptyAccountCount);
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}

class Account {
    private int accountId;
    private String accountHolder;
    private double balance;

    public Account(int accountId, String accountHolder, double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
