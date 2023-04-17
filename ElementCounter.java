import java.util.Collection;
import java.util.List;

public class ElementCounter {
    public static <T> int count(Collection<T> collection, Property<T> property) {
        int count = 0;
        for (T item : collection) {
            if (property.hasProperty(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test with even integers
        Collection<Integer> integerCollection = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Property<Integer> evenProperty = new Property<Integer>() {
            @Override
            public boolean hasProperty(Integer item) {
                return item % 2 == 0;
            }
        };
        int evenCount = ElementCounter.count(integerCollection, evenProperty);
        System.out.println("Number of even integers in the collection: " + evenCount);

        // Test with palindrome strings
        Collection<String> stringCollection = List.of("racecar", "hello", "level", "world", "madam");
        Property<String> palindromeProperty = new Property<String>() {
            @Override
            public boolean hasProperty(String item) {
                StringBuilder sb = new StringBuilder(item);
                return item.equals(sb.reverse().toString());
            }
        };
        int palindromeCount = ElementCounter.count(stringCollection, palindromeProperty);
        System.out.println("Number of palindrome strings in the collection: " + palindromeCount);

        // Test with empty accounts
        Collection<Account> accountCollection = List.of(
                new Account("John", 100.0),
                new Account("Mary", 0.0),
                new Account("Bob", 0.0),
                new Account("Jane", 50.0)
        );
        Property<Account> emptyProperty = new Property<Account>() {
            @Override
            public boolean hasProperty(Account item) {
                return item.getBalance() == 0.0;
            }
        };
        int emptyCount = ElementCounter.count(accountCollection, emptyProperty);
        System.out.println("Number of empty accounts in the collection: " + emptyCount);
    }

    interface Property<T> {
        boolean hasProperty(T item);
    }

    static class Account {
        private final String name;
        private final double balance;

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
