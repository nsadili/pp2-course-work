package EX6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {
        String[] names = {"Shamil", "Vusal", "Leyla", "Elvin"};
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2));
        Stream<Integer> numsStream = set.stream();

        // color

        List<Color> colors = Arrays.asList(
            new Color(2, 0, 0),
            new Color(255, 255, 255),
            new Color(124, 34, 23),
            new Color(0, 0, 255));
        Stream<Color> colorStream = colors.stream();
        
        @SuppressWarnings("unused")
        Optional<Color> res2 = colorStream
                    .filter(c -> c.getR() == 0)
                    .findFirst();

        // allMatch, noneMatch, anyMatch

        System.out.println(namesStream.noneMatch(s -> s.startsWith("V")));

        // count

        System.out.println(
            numsStream
                .filter(num -> num % 2 != 0)
                .filter(num -> num > 4)
                .count());

        // generate, limit

        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100) + 1;
        Stream<Integer> randomStream = Stream.generate(randomNumber).limit(5);
        randomStream.forEach(System.out::println);

        // first any

        Optional<Color> res = colorStream.findAny();

        // if (res.isPresent()) System.out.println(res.get());
        // else System.out.println("Not found");
        
        // instead, use this:
        System.out.println(
            res.isPresent()
                    ? res.get()
                    : "Not found");

        res.ifPresent(System.out::println);

        res.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Not found"));

        Set<Integer> result = numsStream
                .filter(num -> num % 2 == 0)
                .map(num -> num + 1)
                .filter(num -> num > 4)
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
