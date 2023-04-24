import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All even numbers: " + allEven);

        long count = numbers.stream().count();
        System.out.println("Number of elements in stream: " + count);

        Stream.generate(() -> new Random().nextInt(100)).limit(5).forEach(System.out::println);

        numbers.forEach(System.out::println);

        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        firstEven.ifPresentOrElse(
                n -> System.out.println("First even number: " + n),
                () -> System.out.println("No even number found"));

        List<Integer> squares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares of even numbers: " + squares);
    }
}