package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Consumer<String> c1 = str -> System.out.println("Consumer -> " + str);
        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println(newOne);
        };

        c1.accept("Heello");
        c2.accept("POLiCECAR");

        Function<String, Integer> funcLen = str -> (str == null ? 0 : str.length());
        Function<String, Integer> funcLen2 = str -> {

            if (str == null)
                throw new IllegalArgumentException();

            int result = str.length();

            return result;

        };

        System.out.println(funcLen.apply("Shamil"));
        System.out.println(funcLen.apply(null));

        System.out.println(funcLen2.apply("Shamil"));
        // System.out.println(funcLen2.apply(null));

        Predicate<Integer> evenLambda = n -> n % 2 == 0;
        Predicate<String> validWorldLambda = s -> s!=null &&  s.length() > 3;

        System.out.println(evenLambda.test(19));
        System.out.println(evenLambda.test(18));

        System.out.println(validWorldLambda.test("shamil"));
        System.out.println(validWorldLambda.test("19"));
        System.out.println(validWorldLambda.test(null));

        System.out.println("Methods from supplie");

        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(10) +1;
        
        for(var i=0;i<10;i++){
            System.out.println(randomIntSupplier.get());
        }






    }
}
