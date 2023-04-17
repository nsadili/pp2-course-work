package ex6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
// import java.util.List;
import java.util.Map;
// import java.util.Optional;
// import java.util.Random;
import java.util.Set;
// import java.util.function.Supplier;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // String[] names = { "Nuraddin", "Vusat", "Laman", "Narmina", "Bakhtiyar" };
        // Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 19, 21, 18, 26, 23));
        var agesStream = ages.stream();

        Map<String, Integer> map = new HashMap<>();
        map.entrySet().stream();

        // System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));

        // System.out.println(namesStream.noneMatch(name -> name.equals("Nuraddin")));

        // final Random randGen = new Random();
        // Supplier<Integer> supplier = () -> randGen.nextInt(10) + 1;
        // var testStream = Stream.generate(supplier).limit(10);
        // testStream.forEach(num -> System.out.println(num));
        // testStream.forEach(System.out::println);

        // Optional<Integer> foundAge = agesStream
        // .filter(age -> age > 20)
        // .findAny();
        // System.out.println(
        // foundAge.isPresent()
        // ? foundAge.get()
        // : "Not found!");

        // foundAge.ifPresentOrElse(System.out::println,
        // () -> System.out.println("Not found"));

        // agesStream
        // .filter(age -> age % 2 == 0)
        // .filter(age -> age > 4)
        // .forEach(System.out::println);

        Set<Integer> res = agesStream
                .filter(age -> age % 2 == 0)
                .map(age -> age + 1)
                .collect(Collectors.toSet());

        System.out.println(res);
    }
}
