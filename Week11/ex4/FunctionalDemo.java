package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());

        Function<String, Integer> lengthLambda = str ->  str!= null ? str.length() : 0;

        System.out.println(lengthLambda.apply("hello"));
        System.out.println(lengthLambda.apply(null));

        Predicate<Integer> isEven = n -> n%2==0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(10));

         Random rand = new Random(0);

        Supplier<Integer> supplier = () -> rand.nextInt(6)+1;

        for(int i=0; i<15; i++) {
            System.out.println(supplier.get() + " ");
        }
    }

}
