package Week11.StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        String[] names = { "Naik", "Vidadi", "Arzu", "Zakir"};
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 19, 21, 18, 26, 23, 30));
        var agesStream = ages.stream();

        Map<String, Integer> map = new HashMap<>();
        map.entrySet().stream();

        System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));

        System.out.println(namesStream.noneMatch(name -> name.equals("Naik")));

        final Random randGenerator = new Random();
        Supplier<Integer> supplier = () -> randGenerator.nextInt(6) + 1;
        var testStream = Stream.generate(supplier).limit(10);
        testStream.forEach(num -> System.out.println(num));
        testStream.forEach(System.out::println);

        Optional<Integer> foundAge = agesStream
        .filter(age -> age > 20)
        .findAny();
        
        System.out.println(
            foundAge.isPresent() ? foundAge.get() : "Not Found"
         );

        foundAge.ifPresentOrElse(
            System.out::println, () -> System.out.println("Not Found"));
    }
}
