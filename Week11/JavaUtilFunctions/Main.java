package Week11.JavaUtilFunctions;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Consumer:");
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        consumer.accept("Hello");
        consumer.accept("Naik Pashayev");

        System.out.println();
        System.out.println("Function:");
        Function<String, Integer> lengthLambda = str -> str.length();
        System.out.println(lengthLambda.apply("Hello"));
        System.out.println(lengthLambda.apply("Naik"));

        System.out.println();
        System.out.println("Predicate:");
        System.out.println();
        System.out.println("Is even:");
        Predicate<Integer> isEven = num -> num%2 == 0;
        System.out.println(isEven.test(7));
        System.out.println(isEven.test(8));
        System.out.println();
        System.out.println("Is upper:");
        Predicate<Character> isUpper = ch -> Character.isUpperCase(ch);
        System.out.println(isUpper.test('N'));
        System.out.println(isUpper.test('n'));

        System.out.println();
        System.out.println("Supplier:");

        final Random randGenerator = new Random();
        Supplier<Integer> supplier = () -> randGenerator.nextInt(6) + 1;
        for (int i = 0; i < 100; i++) {
            System.out.print(supplier.get() + " ");
        }
        
   }
}
