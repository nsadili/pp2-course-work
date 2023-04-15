package exe4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {
    public static void main(String[] args) {
        
        Consumer<String> cunsumer = (str) -> System.out.println(str.toUpperCase());
        
        cunsumer.accept("Hello");

        Function<String, Integer> lenghtLambda = str -> str != null ? str.length() : 0;

        System.out.println(lenghtLambda.apply("Hello"));
        System.out.println(lenghtLambda.apply(null));

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        Predicate<Character> isUpper = ch -> Character.isUpperCase(ch);

        System.out.println(isUpper.test('A'));
        System.out.println(isUpper.test('a'));

        Random randGen = new Random();
        Supplier<Integer> supplier =() -> new Random(0).nextInt(6) +1;

        for(int i = 0; i < 1000; i++)
            System.out.println(supplier.get() + " ");

        
    }
}