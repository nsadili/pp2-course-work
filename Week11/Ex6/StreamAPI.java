import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean noneEven = numbers.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("All even: " + allEven);
        System.out.println("None even: " + noneEven);

        long countEven = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + countEven);

        Stream<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 100)).limit(5);
        randomNumbers.forEach(System.out::println);

        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // v. findFirst/findAny
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        firstEven.ifPresentOrElse(n -> System.out.println("First even: " + n), () -> System.out.println("No even numbers"));

        // vi. filter/sorted/collect/map
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
