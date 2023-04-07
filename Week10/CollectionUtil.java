package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionUtil {

    public static <T> int countElementsWithProperty(Collection<T> collection, Property<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.hasProperty(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int countEvenIntegers = CollectionUtil.countElementsWithProperty(integers, n -> n % 2 == 0);
        System.out.println("Number of even integers in collection: " + countEvenIntegers);

        Collection<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("finger");
        strings.add("racecar");
        strings.add("level");
        strings.add("palindrome");
        int palindromeCount = countElementsWithProperty(strings, new PalindromeProperty());
        System.out.println("Number of palindrome strings in collection: " + palindromeCount);

        Collection<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Ilqar", 100));
        accounts.add(new Account("Farrukh", 0));
        accounts.add(new Account("Michael", 0));
        accounts.add(new Account("Farid", 300));
        int emptyAccountCount = countElementsWithProperty(accounts, new EmptyBalanceProperty());
        System.out.println("Number of empty accounts in collection: " + emptyAccountCount);
    }

    private static class PalindromeProperty implements Property<String> {
        @Override
        public boolean hasProperty(String element) {
            String reversed = new StringBuilder(element).reverse().toString();
            return element.equals(reversed);
        }
    }

    private static class EmptyBalanceProperty implements Property<Account> {
        @Override
        public boolean hasProperty(Account element) {
            return element.getBalance() == 0;
        }
    }

    private interface Property<T> {
        boolean hasProperty(T element);
    }

    private static class Account {
        private String name;
        private double balance;

        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }
    }
}