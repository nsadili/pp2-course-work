package Week11.HW;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());

        // consumer.accept("Hello");

        Function<String, Integer> lengthlambda = str -> str.length();
    // System.out.println(lengthlambda.apply("hello"));
    // System.out.println(lengthlambda.apply(null));

    Predicate<Integer> isEven = n -> n%2 == 0;
    //System.out.println(isEven.test(3));
    //System.out.println(isEven.test(5));

    Predicate<Character> isUpper = ch -> Character.isUpperCase(ch);
 // System.out.println(isUpper.test('A'));
 // System.out.println(isUpper.test('a'));

 Supplier<Integer> suplier = () -> new Random().nextInt(5) + 1;

 for(int i = 0; i < 15; i++)
 System.out.print(suplier.get() + " ");
}
    
}
