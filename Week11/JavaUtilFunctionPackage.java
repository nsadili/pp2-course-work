package week11codes;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtilFunctionPackage {
    public static void main(String[] args) {
        
        Consumer<Integer> consumer = System.out::println;
        System.out.print("Consumer test: Prints Integer -> ");
        consumer.accept(5);

        Function<String, String> function = s -> s + " " + s;
        System.out.println("Function test: Doubles string -> " + function.apply("Hello"));

       
        Predicate<Long> predicate = aLong -> aLong > 100000;
        System.out.println("Predicate test: Longer than 100000 -> " + "999999 is longer than 100000: " + predicate.test(999999L));

        
        Supplier<Double> supplier = Math::random;
        System.out.println("Supplier test: Random number -> " + supplier.get());
    }
}