package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        String[] names = { "Nuraddin, Vusal, Laman, Narmina, Bakhtiyar" };
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 19, 21, 18, 19, 26, 23, 30));
        var agesStream = ages.stream();

        // Map<String, Integer> map = new HashMap<>();
        // map.entrySet().stream();

        // System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));

        // System.out.println(namesStream.noneMatch(name -> name.equals("Nuraddin")));

        Random randGen = new Random();
        Supplier<Integer> supplier = () -> randGen.nextInt(6) + 1;

        var testStream = Stream.generate(supplier).limit(10);
        // testStream.forEach(num -> System.out.print(num + " "));

        // testStream.forEach(System.out::print);

        Optional<Integer> foundage = agesStream
                .filter(age -> age > 20)
                .map(age -> age + 1)
                //.collect(Collector.) ???
                .findAny();

        System.out.println(
                foundage.isPresent()
                        ? foundage.get()
                        : "Not found");

        foundage.ifPresentOrElse(
                System.out::println, // ===>>> num -> System.out.println(num),
                // you can do that as well
                () -> System.out.println("Not Found")); // Runnable func interface

        List<Color> colors = Arrays.asList(
                new Color(255, 255, 255),
                new Color(0, 0, 0),
                new Color(127, 127, 127));
        Stream<Color> colorStream = colors.stream();

    }
}
