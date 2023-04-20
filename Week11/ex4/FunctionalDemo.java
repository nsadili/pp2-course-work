package ex4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalDemo{
    public static void main(String[] args) {
        Consumer<String> consumer= (str) -> System.out.println(str.toUpperCase());

       // consumer.accept("Hello");

       Function<String, Integer> lengthLambda = str -> str.length();

      // System.out.println(lengthLambda.apply(null));

      Predicate<Integer> isEven= n-> n%2==0;

      System.out.println();
       
    }
    }