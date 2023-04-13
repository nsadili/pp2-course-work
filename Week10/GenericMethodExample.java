import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericMethodExample {

    public static <T> int countElementsWithProperty(Collection<T> collection, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.check(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test case 1: Counting even integers
        Collection<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = countElementsWithProperty(integers, new PropertyChecker<Integer>() {
            @Override
            public boolean check(Integer element) {
                return element % 2 == 0;
            }
        });
        System.out.println("Even integers count: " + evenCount);

        // Test case 2: Counting palindrome strings
        Collection<String> strings = Arrays.asList("racecar", "hello", "madam", "world", "level");
        int palindromeCount = countElementsWithProperty(strings, new PropertyChecker<String>() {
            @Override
            public boolean check(String element) {
                return element.equals(new StringBuilder(element).reverse().toString());
            }
        });
        System.out.println("Palindrome strings count: " + palindromeCount);

        // Test case 3: Counting empty accounts
        Collection<Account> accounts = Arrays.asList(
                new Account(1, "Riad", 100.0),
                new Account(2, "Murad", 0.0),
                new Account(3, "Nana", 500.0),
                new Account(4, "Lala", 0.0),
                new Account(5, "Tofig", 50.0));
        int emptyAccountCount = countElementsWithProperty(accounts, new PropertyChecker<Account>() {
            @Override
            public boolean check(Account element) {
                return element.getBalance() == 0.0;
            }
        });
        System.out.println("Empty accounts count: " + emptyAccountCount);
    }
}

interface PropertyChecker<T> {
    boolean check(T element);
}

class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
