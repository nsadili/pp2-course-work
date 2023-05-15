package Week11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtilPackage {
    public static void main(String[] args) {
        
        Consumer<String> printer = str -> System.out.println("Consumer: " + str);
        printer.accept("Hello, world!"); 
        Function<Integer, Integer> increment = num -> num + 1;
        int result = increment.apply(5);
        System.out.println("Function: " + result); 
        Predicate<Integer> isPositive = num -> num > 0;
        boolean predicateResult = isPositive.test(-5);
        System.out.println("Predicate: " + predicateResult); 
        Supplier<Integer> randomGenerator = () -> (int) (Math.random() * 100);
        int supplierResult = randomGenerator.get();
        System.out.println("Supplier: " + supplierResult);
    }
}
