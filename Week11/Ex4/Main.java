package Week11.Ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println("Customer 1: " + str);
        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println("Customer 1 (lowercased): " + newOne);
        };

        // c1.accept("Rufat");
        // c2.accept("Meqi");

        Function<String, Integer> f1 = str -> (str == null) ? 0 : str.length();
        Function<String, Integer> f2 = str -> {
            if (str == null)
                throw new IllegalArgumentException();
            return str.length();
        };

        // System.out.println(f1.apply("Programming"));
        // System.out.println(f1.apply(""));
        // System.out.println(f2.apply("Programming"));
        // System.out.println(f2.apply(null));

        Predicate<Integer> isEvenInt = n -> n % 2 == 0;
        Predicate<String> validStr = s -> s != null && s.length() > 3;

        // System.out.println(isEvenInt.test(5));
        // System.out.println(isEvenInt.test(10));

        // System.out.println(validStr.test("Rufat"));
        // System.out.println(validStr.test("ab"));
        // System.out.println(validStr.test(null));


        Supplier<Integer> randomIntSupplier = ()->new Random().nextInt(10)+1;
        System.out.println(randomIntSupplier.get());
    }
}
