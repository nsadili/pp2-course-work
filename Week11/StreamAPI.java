package Week11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(result);

        //first even number
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresentOrElse(
            System.out::println, 
            () -> System.out.println("No even number found")
        );

        //generate 5 random numbers and print them
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        //count the number of odd numbers
        long oddCount = numbers.stream()
                .filter(n -> n % 2 == 1)
                .count();
        System.out.println("Odd count: " + oddCount);

        //check if all numbers are even
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("All even: " + allEven);

        //sort the numbers in reverse order
        List<Integer> sorted = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

}
