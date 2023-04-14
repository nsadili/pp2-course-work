package Ex.ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());

        // consumer.accept("Hello");

        Function<String, Integer> legthLamda = str -> str.length();

        // System.out.println(legthLamda.apply("hello"));

        Predicate<Integer> isEven = n -> n % 2 == 0;

        // System.out.println(isEven.test(5));
        // System.out.println(isEven.test(8));

        Predicate<Character> isupper = ch -> Character.isUpperCase(ch);

        // System.out.println(isupper.test('a'));

        // System.out.println(isupper.test('A'));

        final Random randGen = new Random();

        Supplier<Integer> supp = () -> new Random().nextInt(6) + 1;

        for (int i = 0; i < 1000; i++)
            System.out.print(supp.get()+ " ");



    }
}
