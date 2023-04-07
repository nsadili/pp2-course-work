import java.util.ArrayList;
import java.util.Collection;

public class Exercise_4 {

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
        // Test case 1: count even integers
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        int evenCount = countElementsWithProperty(integers, new EvenProperty());
        System.out.println("Number of even integers in collection: " + evenCount);

        // Test case 2: count palindrome strings
        Collection<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("racecar");
        strings.add("level");
        strings.add("palindrome");
        int palindromeCount = countElementsWithProperty(strings, new PalindromeProperty());
        System.out.println("Number of palindrome strings in collection: " + palindromeCount);

        // Test case 3: count empty accounts
        Collection<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, 100));
        accounts.add(new Account(2, 0));
        accounts.add(new Account(3, 500));
        accounts.add(new Account(4, 0));
        int emptyAccountCount = countElementsWithProperty(accounts, new EmptyBalanceProperty());
        System.out.println("Number of empty accounts in collection: " + emptyAccountCount);
    }

    private static class EvenProperty implements Property<Integer> {
        @Override
        public boolean hasProperty(Integer element) {
            return element % 2 == 0;
        }
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
        private int id;
        private int balance;

        public Account(int id, int balance) {
            this.id = id;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public int getBalance() {
            return balance;
        }
    }
}
