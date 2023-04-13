package EX4;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionsDemo {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println(str);
        Consumer<String> c2 = str -> System.out.println(str.toUpperCase());

        c1.accept("Hello");
        c2.accept("Hello");

        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, Integer> toLength = str -> str == null ? 0 : str.length();

        System.out.println(toUpper.apply("My name is Leyla"));
        System.out.println(toLength.apply("Programming Principles 2"));
        System.out.println(toLength.apply(null));
    }
}
