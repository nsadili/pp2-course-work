package Week10.ex04;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Generic {
    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void testEvenIntegers() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        int count = countElementsWithProperty(integerList, isEven);
        System.out.println("Number of even integers: " + count);
    }
    
    public static void testPalindromeStrings() {
        List<String> stringList = Arrays.asList("racecar", "hello", "deified", "world", "madam");
        Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());
        int count = countElementsWithProperty(stringList, isPalindrome);
        System.out.println("Number of palindrome strings: " + count);
    }

    public static void testEmptyAccounts() {
        List<Account> accountList = Arrays.asList(new Account(1, 100.0), new Account(2, 0.0), new Account(3, 50.0), new Account(4, 0.0));
        Predicate<Account> hasZeroBalance = a -> a.getBalance() == 0.0;
        int count = countElementsWithProperty(accountList, hasZeroBalance);
        System.out.println("Number of empty accounts: " + count);
    }    
}

class Account {
    private int accountNumber;
    private double balance;

    public Account(int i, double balance) {
        this.accountNumber = i;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
