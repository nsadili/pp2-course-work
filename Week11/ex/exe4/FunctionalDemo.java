package exe4;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalDemo{
    public static void main(String[] args) {
        Consumer <String> consumer = str -> System.out.println(str.toUpperCase());
        //consumer.accept("Hello");

        Function<String, Integer> lengthLambda = str -> str != null ? str.length() : 0;
        //System.out.println(lengthLambda.apply("Hello")); 

        Predicate<Integer> isEven = n -> n % 2 == 0;
        //System.out.println(5);

        Predicate<Character> isUpper = ch -> Character.isUpperCase(ch);
        //System.out.println(isUpper.test('A')); 

        Supplier<Integer> supplier = () -> new Random().nextInt(6) + 1;

        for (int i = 0; i < 15; i++);
            System.out.println(supplier.get() + " ");
    }
}