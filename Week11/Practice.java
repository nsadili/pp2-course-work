import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice {
    public static void main(String[] args) {
        // Consumer example
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("Hello, World!");

        // Function example
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));

        // Predicate example
        Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome.test("racecar"));

        // Supplier example
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber.get());
    }
}
