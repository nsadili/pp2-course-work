package Week11.ex06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 12, 13);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        long count = numbers.stream().count();
        Stream<Integer> stream = Stream.generate(() -> 0).limit(5);

        System.out.println(allEven);
        System.out.println(noneNegative);
        System.out.println(count);
        System.out.println(stream.collect(Collectors.toList()));

        numbers.stream().forEach(n -> System.out.println(n));

        
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.err.println(firstEven);
        List<String> names = Arrays.asList("Ali", "Teymur", "Charlie Chaplin");

        Optional<String> anyStartsWithB = names.stream().filter(s -> s.startsWith("B")).findAny();
        anyStartsWithB.ifPresentOrElse(System.out::println, () -> System.out.println("No name starts with B"));

        List<Integer> evenNumbersSorted = numbers.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(evenNumbersSorted);

        List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLengths);
    }
}
