package Week11.ex4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionsDemo {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println(str);
        Consumer<String> c2 = str -> System.out.println(str.toLowerCase());
        
        c1.accept("Hello");
        c2.accept("Hello");

        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, Integer> toLength = str -> str == null ? 0 : str.length();

        System.out.println(toUpper.apply("my nAme is ..... bella hadid"));
        System.out.println(toLength.apply("my nAme is ..... bella hadid"));

        Predicate<Integer> isOdd = n -> n%2 != 0;
        System.out.println(isOdd.test(5));
        System.out.println(isOdd.test(10));

        Predicate<String> isAnagram = str -> str != null && new StringBuilder(str).reverse().toString().equals(str);
        System.out.println(isAnagram.test("meow"));
    }
}