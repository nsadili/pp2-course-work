package ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsDemo1 {
    
    public static void main(String[] args) {
        String[] names = {"Shamil", "Vusal", "Leyla", "Elvin", "Selya"};
        Stream<String> namesStream = Arrays.stream(names);


        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 19, 21, 18, 26, 23));
        Stream<Integer> agesStream = ages.stream();

        // Map<String, Integer> map = new HashMap<>();
        //map.entrySet().stream()

       System.out.println(namesStream.anyMatch(name -> name.startsWith("S"))); 
      

        final Random randGen = new Random();
        Supplier<Integer> supplier = () -> randGen.nextInt(6) + 1;
        var testStream = Stream.generate(supplier).limit(10);

       testStream.forEach(num -> System.out.println(num));
       testStream.forEach(System.out ::println);

       Optional<Integer> foundAge = agesStream
       .filter(age -> age > 20)
       .findAny();

       //System.out.println(
        //foundAge.isPresent()
        //? foundAge.get()
        //: "Notfound");

        foundAge.ifPresentOrElse(
            System.out :: println,
            () -> System.out.println("Not found"));
       

    }    
    }

