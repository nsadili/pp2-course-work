package ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo {
    public static void main(String[] args) {
        
Consumer<String> c1 = str -> System.out.println(str);
Consumer<String> c2 = str -> System.out.println(str.toUpperCase());

 c1.accept("hello");
 c2.accept("Salam");

 Function<String, String> toUpper = str -> str.toUpperCase();
 Function<String, Integer> toLength = str -> str == null ? 0 : str.length();

 System.out.println(toUpper.apply("my name is Selya"));
 System.out.println(toLength.apply("Programming principles 2"));
 System.out.println(toLength.apply(null));
  
 Predicate<Integer> isOdd = n -> n%2 !=0;

 System.out.println(isOdd.test(5));
 System.out.println(isOdd.test(10));

 final Random randGen = new Random();
 
 Supplier<Integer> supplier = () -> randGen.nextInt(6) + 1;
 System.out.println(supplier.get());
}
}
