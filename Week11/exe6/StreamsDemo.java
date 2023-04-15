
package exe6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class StreamsDemo {
    public static void main(String[] args) {
        
        String[] names = {"Jala", "Ulkar", "Brilyant", "Cahid"};
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 20, 21, 18, 25, 98, 64, 21, 98));
        var agesStream = ages.stream();

        // Map<String, Integer> map = new HashMap<>();
        // map.entrySet().stream();

        // System.out.println(namesStream.anyMatch(  name -> name.startsWith("N")));
        // System.out.println(namesStream.noneMatch(name -> name.equals("Jala")));

        final Random randGen = new Random();
        Supplier<Integer> supplier = ()-> randGen.nextInt(6)+ 1;
        
        var testStream = Stream.generate(supplier).limit(10);
        // testStream.forEach(num -> System.out.println(num));
        // testStream.forEach( System.out::println );

        Optional<Integer> foundAge = agesStream
        .filter(age -> age > 20)
        .findAny();

        // System.out.println(
        //     foundAge.isPresent()
        //         ? foundAge
        //         :
        //         "Not found");

        foundAge.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Not found"));
    }
}