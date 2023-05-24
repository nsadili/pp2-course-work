package Week11.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    
    List<Integer> arr= Arrays.asList(3,4,5,7,8);
    Stream<Integer> stream= arr.stream();
   // System.out.println(stream.allMatch(n -> n%2==1);
   System.out.println(stream.count());
   Supplier<Integer> supplier = () -> new Random().nextInt(100);
   Predicate<Integer> pred = (n) -> n%2==0;
   Stream.generate(supplier)
                   .limit(10)

                   .forEach((n) -> System.out.println(n))
                   .filter(pred);

}
