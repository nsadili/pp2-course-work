package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo {
    
    static Random randomGenerator = new Random();

    public static void main(String[] args) {

        
        Consumer<String> c1 = str -> System.out.println(str);
        Consumer<String> c2 = str -> System.out.println(str.toUpperCase());

        // c1.accept("Hello");
        // c2.accept("Hello");


        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, Integer> toLength = str -> str == null ? 0 : str.length();

        // System.out.println(toUpper.apply("my name is ...."));

        // System.out.println(toLength.apply("Programming Principles 2"));
        // System.out.println(toLength.apply(null));


        Predicate<Integer> isOdd = n -> n % 2 != 0;

        // System.out.println(isOdd.test(4));
        // System.out.println(isOdd.test(9));

        Predicate<String> isAnagram = str -> str != null &&
                new StringBuilder(str)
                        .reverse().toString().equals(str);

        // System.out.println(isAnagram.test("abcba"));


        
        
        Supplier<Integer> rand = () -> randomGenerator.nextInt(10) + 1;

        double avg = 0;

        for (int i = 0; i < 1000; i++)
        avg += rand.get();

        avg = avg / 1000;

        System.out.println(avg);

    }
}