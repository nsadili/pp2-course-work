package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println("Consumed: " + str);
        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println(newOne);
        };
        // c1.accept("Hello!");
        // c2.accept("HELLO!");
        Function<String, Integer> funcLen = str -> (str == null ? 0 : str.length());
        Function<String, Integer> funcLen1 = (str) -> {
            if (str == null)
                throw new IllegalArgumentException(str);
            int res = str.length();
            return res;
        };
        // System.out.println(funcLen.apply("Rahima"));
        // System.out.println(funcLen1.apply("Rahima"));
        // System.out.println(funcLen.apply(null));
        // System.out.println(funcLen1.apply(null));

        Predicate<Integer> evenLambda = n -> n % 2 == 0;
        Predicate<String> validWordLambda = n -> n!=null && n.length() >= 3;
        // System.out.println(evenLambda.test(345678));
        // System.out.println(evenLambda.test(13));
        // System.out.println(validWordLambda.test("Programming"));
        // System.out.println(validWordLambda.test(null));
        Supplier <Integer> randomIntSupplier = ()->new Random().nextInt(10)+1;
        for(int i=0;i<10;i++){
            System.out.println(randomIntSupplier.get());
        }
    }
}
