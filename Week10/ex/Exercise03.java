package Week10.ex;

import java.util.Arrays;
import java.util.Collection;

public class Exercise03 {
    public static <T> int countElementsWithProperty(Collection<T> collection, PropertyChecker<T> propertyChecker) {
        int count = 0;
        for (T element : collection) {
            if (propertyChecker.checkProperty(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> integerCollection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = countElementsWithProperty(integerCollection, new PropertyChecker<Integer>() {
            @Override
            public boolean checkProperty(Integer element) {
                return element % 2 == 0;
            }
        });
        System.out.println("Number of even integers: " + evenCount);

        Collection<String> stringCollection = Arrays.asList("hello", "world", "level", "deed", "radar");
        int palindromeCount = countElementsWithProperty(stringCollection, new PropertyChecker<String>() {
            @Override
            public boolean checkProperty(String element) {
                String reversed = new StringBuilder(element).reverse().toString();
                return element.equals(reversed);
            }
        });
        System.out.println("Number of palindrome strings: " + palindromeCount);

        Collection<Account> accountCollection = Arrays.asList(new Account("John", 100),
                new Account("Jake", 0),
                new Account("Tom", 200),
                new Account("Ashley", 0));
        int emptyAccountCount = countElementsWithProperty(accountCollection, new PropertyChecker<Account>() {
            @Override
            public boolean checkProperty(Account element) {
                return element.getBalance() == 0;
            }
        });
        System.out.println("Number of empty accounts: " + emptyAccountCount);
    }

    interface PropertyChecker<T> {
        boolean checkProperty(T element);
    }

    static class Account {
        private double balance;

        public Account(String name, double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }
    }
}

