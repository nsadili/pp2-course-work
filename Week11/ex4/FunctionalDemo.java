package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());


        Function<String, Integer> legthLamda = str -> str.length();


        Predicate<Integer> isEven = n -> n % 2 == 0;


        Predicate<Character> isupper = ch -> Character.isUpperCase(ch);



        final Random randGen = new Random();

        Supplier<Integer> supp = () -> new Random().nextInt(12) + 1;

        for (int i = 0; i < 1000; i++)
            System.out.print(supp.get()+ " ");



    }
}
