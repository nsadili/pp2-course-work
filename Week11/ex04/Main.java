package Week11.ex04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Hello, world!");

        Function<String, Integer> stringToInt = str -> Integer.parseInt(str);
        int resultInt = stringToInt.apply("42");

        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean resultBool = isEven.test(42);

        Supplier<Double> random = () -> Math.random();
        double resultDouble = random.get();


        System.out.println(resultInt);
        System.out.println(resultBool);
        System.out.println(resultDouble);
    }
}
