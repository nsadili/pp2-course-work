package ex4;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        Consumer<String> c1 = (str) -> System.out.println("Consumed: " + str);
        c1.accept("Hello");

        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println(newOne);
        };
        c2.accept("Hey there");

        Function<String, Integer> funcLen = str -> (str == null ? 0 : str.length());

        Function<String, Integer> funcLen2 = (str) -> {
            if(str == null) {
                throw new IllegalArgumentException();
            }
            int res = str.length();
            return res;
        };

        System.out.println(funcLen.apply("Nuraddin"));
        System.out.println(funcLen2.apply("Nuraddin"));

        try {
            System.out.println(funcLen.apply(null));
            System.out.println(funcLen2.apply(null));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred");
        }
    }
}
