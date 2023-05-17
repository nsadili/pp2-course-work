package Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Reference to a static method
        Function<Integer, String> converter = t -> t.toString();
        String converted = converter.apply(42);
        System.out.println(converted); // Output: "42"
        
        // Reference to an instance method of a particular object
        String message = "Hello, World!";
        Predicate<String> startsWithHello = message::startsWith;
        System.out.println(startsWithHello.test("Hello")); // Output: true
        
        // Reference to an instance method of an arbitrary object of a particular type
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);
        
        // Reference to a constructor
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();
        newList.add("John");
        System.out.println(newList); // Output: ["John"]
    }
}
