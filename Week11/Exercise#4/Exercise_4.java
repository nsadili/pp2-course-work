import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise_4 {

    public static void main(String[] args) {

        // Consumer - takes an argument and performs an action, but doesn't return anything
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("Hello, world!"); // prints "Hello, world!"

        // Function - takes an argument, performs a transformation, and returns a result
        Function<String, Integer> strLength = s -> s.length();
        int length = strLength.apply("Hello, world!"); // length = 13
        System.out.println("Length of string: " + length);

        // Predicate - takes an argument and returns a boolean result
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 7 even? " + isEven.test(7)); // false

        // Supplier - doesn't take any arguments, but produces a result
        Supplier<List<String>> createStringList = ArrayList::new;
        List<String> stringList = createStringList.get();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        System.out.println("List of strings: " + stringList);
    }
}


