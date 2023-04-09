import java.util.Arrays;
import java.util.Collection;

public class ElementCounter {

    public static <T> int countElements(Collection<T> collection, ElementProperty<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.hasProperty(element)) {
                count++;
            }
        }
        return count;
    }

    public static void testEvenIntegers() {
        Integer[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int count = countElements(Arrays.asList(integers), new ElementProperty<Integer>() {
            public boolean hasProperty(Integer element) {
                return element % 2 == 0;
            }
        });
        System.out.println("Number of even integers: " + count);
    }

    public static void testPalindromeStrings() {
        String[] strings = { "racecar", "hello", "level", "world", "deified" };
        int count = countElements(Arrays.asList(strings), new ElementProperty<String>() {
            public boolean hasProperty(String element) {
                return element.equals(new StringBuilder(element).reverse().toString());
            }
        });
        System.out.println("Number of palindrome strings: " + count);
    }

    public static void testEmptyAccounts() {
        Account[] accounts = { new Account(100), new Account(0), new Account(50), new Account(0) };
        int count = countElements(Arrays.asList(accounts), new ElementProperty<Account>() {
            public boolean hasProperty(Account element) {
                return element.getBalance() == 0;
            }
        });
        System.out.println("Number of empty accounts: " + count);
    }

    public static void main(String[] args) {
        testEvenIntegers();
        testPalindromeStrings();
        testEmptyAccounts();
    }

}

interface ElementProperty<T> {
    boolean hasProperty(T element);
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
