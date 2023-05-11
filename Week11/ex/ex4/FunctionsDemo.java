package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());

        // consumer.accept("Hello");

        Function<String, Integer> lengthLamda = str -> str.length();

        // System.out.println(lengthLamda.apply("hello"));

        Predicate<Integer> isEven = n -> n % 2 == 0;

        // System.out.println(isEven.test(3));
        // System.out.println(isEven.test(5));

        Predicate<Character> isupper = ch -> Character.isUpperCase(ch);

        // System.out.println(isupper.test('a'));

        // System.out.println(isupper.test('A'));

        final Random randGen = new Random();

        Supplier<Integer> supp = () -> new Random().nextInt(7) + 1;

        for (int i = 0; i < 1000; i++)
            System.out.print(supp.get()+ " ");



    }
}