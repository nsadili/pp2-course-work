import java.util.Collection;
import java.util.function.Predicate;
import java.util.List;

public class CountElement {

    public static void main(String[] args) {

        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        int countEven = countElementsWithProperty(numbers, isEven);
        System.out.println("Number of even integers: " + countEven);

        Collection<String> strings = List.of("racecar", "world", "hello", "deified", "level");
        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        int countPalindrome = countElementsWithProperty(strings, isPalindrome);
        System.out.println("Number of Palindrome strings: " + countPalindrome);

        Collection<Account> accounts = List.of(new Account(0.0), new Account(100.0), new Account(0.0), new Account(50.0));
        Predicate<Account> isEmptyAccount = account -> account.getBalance() == 0;
        int countEmptyAccounts = countElementsWithProperty(accounts, isEmptyAccount);
        System.out.println("Number of Empty accounts: " + countEmptyAccounts);
    }

    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEmptyAccount(Account account) {
        return account.getBalance() == 0;
    }

    
}