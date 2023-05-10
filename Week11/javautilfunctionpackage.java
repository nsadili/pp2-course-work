package Week11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class javautilfunctionpackage {
    public static void main(String[] args) {
    
        Consumer<Integer> consumer = System.out::println;
        System.out.print("Consumer test: Prints Integer -> ");
        consumer.accept(8);

        
        Function<String, String> function = s -> s + " " + s;
        System.out.println("Function test: Doubles string -> " + function.apply("Hi"));

        
        Predicate<Long> predicate = aLong -> aLong > 1000;
        System.out.println("Predicate test: Longer than 1000 -> " + "9999 is longer than 1000: " + predicate.test(999999L));

        
        Supplier<Double> supplier = Math::random;
        System.out.println("Supplier test: Random number -> " + supplier.get());
    }
}