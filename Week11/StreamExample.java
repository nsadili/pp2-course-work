package Ex6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> words = Arrays.asList("hello", "world");
        List<Integer> wordLengths = words.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println(wordLengths);

        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        boolean allEven = numbers.stream()
            .allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        boolean noneNegative = numbers.stream()
            .noneMatch(n -> n < 0);
        System.out.println(noneNegative);

        long wordCount = words.stream()
            .count();
        System.out.println(wordCount);

        Stream<Integer> infiniteStream = Stream.generate(() -> 1);
        List<Integer> finiteStream = Stream.generate(() -> 1)
            .limit(10)
            .collect(Collectors.toList());
        System.out.println(finiteStream);

        numbers.stream()
            .forEach(n -> System.out.println(n));

        Optional<Integer> firstEven = numbers.stream()
            .filter(n -> n % 2 == 0)
            .findFirst();
        firstEven.ifPresentOrElse(
            n -> System.out.println("First even number: " + n),
            () -> System.out.println("No even numbers found")
        );
    }
}
