package Week11.ex.ex2;

import java.util.function.*;

public class JavaUtilPackage {
    public static void main(String[] args) {
        Consumer<Integer> printInteger = n -> System.out.println(n);
        printInteger.accept(95);

        Function<Double, Double> getReciprocal = n -> (1 / n);
        System.out.println(getReciprocal.apply(0.12009));

        Predicate<String> isAnagram = s -> new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isAnagram.test("abcba"));

        Supplier<Double> getRandomDouble = Math::random;
        System.out.println(getRandomDouble.get());
    }
}
