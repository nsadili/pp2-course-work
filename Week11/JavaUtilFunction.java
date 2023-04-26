
import java.util.function.*;

import java.util.function.Supplier;
public class JavaUtilFunction {
    public static void main(String[] args) {
        // Costumer -> void
        // Function -> result
        // Predicate -> boolean
        // Supplier -> Taking nothing Returns result (Returning random number etc.)

        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello World!");
        Function<Integer, Integer> squareOfIntegers = (Integer n) -> n * n;
        System.out.println(squareOfIntegers.apply(5));
        Predicate<String> isEmpty = str -> str.isEmpty();
        boolean result = isEmpty.test("");
        System.out.println(result);
        Supplier<Integer> randomInt = () -> (int) (Math.random() * 1000);
        int result1 = randomInt.get(); 
        System.out.println(result1);
    }
}
