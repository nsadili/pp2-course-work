import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = str -> System.out.println("Consuming " + str);
        consumer.accept("Java");

        Function<String, Integer> function = str -> str.length();
        int result = function.apply("Hello World");
        System.out.println("Function result: " + result);

        Predicate<Integer> predicate = num -> num > 0;
        boolean isPositive = predicate.test(-5);
        System.out.println("Is positive: " + isPositive);

        Supplier<String> supplier = () -> "Hello Supplier";
        String value = supplier.get();
        System.out.println("Supplied value: " + value);
    }
}