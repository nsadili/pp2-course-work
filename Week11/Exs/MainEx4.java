package Exs;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainEx4 {
    public static void main(String[] args) {
        Consumer<String> c1 = (str) -> System.out.println("Consumed: " + str);
        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println(newOne);

        };

        Function<String, Integer> funclen = str -> (str == null ? 0 : str.length());
        Function<String, Integer> funclen2 = str -> {
            if (str == null)
                throw new IllegalArgumentException();
            int res = str.length();
            return res;
        };

        Predicate<Integer> evenLambda = n -> n % 2 == 0;

        Predicate<String> validWordLambda = s -> s != null && s.length() > 3;

        Supplier<Integer> randomIntSupplier = () -> {
            return new Random().nextInt(10) + 1;
        };

        for (int i = 0; i < 10; i++)
            System.out.println(randomIntSupplier.get());

    }

}
