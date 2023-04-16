package ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;



public class StreamsDemo {
    public static void main(String[] args) {
        String[] names = {"Nuraddin", "Vusat", "Laman", "Narmina", "Bakhtiyar"};
        Stream<String> namesStream = Arrays.stream(names);

        
        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 19, 21, 18, 26, 23, 30));
        var agesStream = ages.stream();

         
       //System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));
       //System.out.println(namesStream.noneMatch(name -> name.equals("Nuraddin")));

       final Random randGen = new Random();
       Supplier<Integer> supplier = () -> new Random().nextInt(6) + 1;
       var testStream = Stream.generate(supplier).limit(10);
       //estStream.forEach(num -> System.out.println(num));
       //testStream.forEach(System.out::println); same thing

       Optional<Integer> foundAge = agesStream.findAny();
       System.out.println(
               foundAge.isPresent()
                       ? foundAge.get()
                       : "Not found" 
       );

       //foundAge.ifPresentOrElse(
                  //System.out::println,
                  //() -> System.out.println("Not found")
            //);
       
       
    }
}
