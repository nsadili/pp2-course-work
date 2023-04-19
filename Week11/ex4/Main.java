package Week11.ex4;

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

    //     c1.accept("Hello");
    //     c2.accept("Hey there");

        Function<String, Integer> funclen = str -> (str == null ? 0 : str.length());
        Function<String, Integer> funclen2 = str -> {
            if (str == null)
                throw new IllegalArgumentException();
            int result = (str.length());
            return result;

        };

        System.out.println(funclen.apply("Nijat"));
        System.out.println(funclen2.apply("Nijat"));
        System.out.println(funclen.apply(null));    
        System.out.println(funclen2.apply(null));    

        Predicate<Integer> evenLambda = n -> n % 2 == 0;
        Predicate<String> validWordLambda = s -> s != null && s.length() > 3;

        // System.out.println(evenLambda.test(5));
        // System.out.println(evenLambda.test(6));

        // System.out.println(validWordLambda.test("Nijat"));
        // System.out.println(validWordLambda.test("hey"));
        // System.out.println(validWordLambda.test(null));


        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(10) + 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(randomIntSupplier.get());
        }


    }

}