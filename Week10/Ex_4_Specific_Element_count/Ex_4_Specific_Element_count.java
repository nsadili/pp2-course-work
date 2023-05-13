import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Ex_4_Specific_Element_count {
    public static void main(String[] args) {
        testCountEvenIntegers();
        testCountEmptyAccounts();
        testCountPalindromeStrings();

    }
    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void testCountEvenIntegers() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = countElements(integers, n -> n % 2 == 0);
        System.out.println(count);
    }


    public static void testCountPalindromeStrings() {
        List<String> strings = Arrays.asList("racecar", "hello", "level", "world", "deified");
        int count = countElements(strings, s -> new StringBuilder(s).reverse().toString().equals(s));
        System.out.println(count);
    }


    public static void testCountEmptyAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("Abbas", "Abbasov", 0.0),
                new Account("Murad", "Abbasov", 100.0),
                new Account("Ibrahim", "Hajiyev", 0.0),
                new Account("Cavad", "Hajiyev", 50.0)
        );
        int count = countElements(accounts, a -> a.balance == 0.0);
        System.out.println(count);
    }



}