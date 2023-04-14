package EX4;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo {
    public static void main(String[] args) {
        // consumer
        Consumer<String> c1 = str -> System.out.println(str);
        Consumer<String> c2 = str -> System.out.println(str.toUpperCase());

        c1.accept("Hello");
        c2.accept("Hello");

        // function
        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, Integer> toLength = str -> str == null ? 0 : str.length();

        System.out.println(toUpper.apply("My name is Leyla"));
        System.out.println(toLength.apply("Programming Principles 2"));
        System.out.println(toLength.apply(null));
        
        // predicate (found, base, logic)
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        System.out.println(isOdd.test(5));
        System.out.println(isOdd.test(10));

        Predicate<String> isAnagram = str -> str != null &&
                new StringBuilder(str)
                        .reverse().toString().equals(str);
        System.out.println(isAnagram.test("abcba"));

        // supplier
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100) + 1;
        double avg = 0;
        
        for (int i = 0; i < 1000; i++) avg += randomNumber.get();
        avg = avg / 1000;
        System.out.println(avg);
    }
}
