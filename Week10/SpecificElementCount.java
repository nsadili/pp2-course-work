package Week10;

import java.util.ArrayList;
import java.util.List;

public class SpecificElementCount {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        System.out.println("Number of even integers in intList: " + countEvenIntegers(intList));

        List<String> stringList = new ArrayList<>();
        stringList.add("racecar");
        stringList.add("radar");
        stringList.add("level");
        stringList.add("deified");
        stringList.add("civic");
        stringList.add("redder");
        stringList.add("madam");
        stringList.add("refer");
        stringList.add("did");
        stringList.add("noon");
        System.out.println("Number of palindrome strings in stringList: " + countPalindromeStrings(stringList));

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1, 0));
        accountList.add(new Account(2, 0));
        accountList.add(new Account(3, 0));
        accountList.add(new Account(4, 0));
        accountList.add(new Account(5, 0));
        accountList.add(new Account(6, 0));
        accountList.add(new Account(7, 0));
        accountList.add(new Account(8, 0));
        accountList.add(new Account(9, 0));
        accountList.add(new Account(10, 0));
        System.out.println("Number of empty accounts in accountList: " + countEmptyAccounts(accountList));
    }

    public static int countEvenIntegers(List<Integer> list) {
        int count = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countPalindromeStrings(List<String> list) {
        int count = 0;
        for (String string : list) {
            if (isPalindrome(string)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String string) {
        int low = 0;
        int high = string.length() - 1;
        while (high > low) {
            if (string.charAt(low) != string.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static int countEmptyAccounts(List<Account> list) {
        int count = 0;
        for (Account account : list) {
            if (account.getBalance() == 0) {
                count++;
            }
        }
        return count;
    }

    static class Account {
        private int id;
        private double balance;

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

}
