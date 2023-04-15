import java.util.*;
import java.util.stream.*;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);

        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Are there any negative numbers? " + noneNegative);

        long count = numbers.stream().count();
        System.out.println("There are " + count + " numbers in the list");

        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(100)).limit(5);
        randomStream.forEach(System.out::println);

        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        firstEven.ifPresentOrElse(n -> System.out.println("The first even number is " + n),
                () -> System.out.println("There is no even number"));

        Optional<Integer> anyOdd = numbers.stream().filter(n -> n % 2 != 0).findAny();
        anyOdd.ifPresentOrElse(n -> System.out.println("An odd number is " + n),
                () -> System.out.println("There is no odd number"));

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<String> numberStrings = numbers.stream().map(n -> "Number " + n).collect(Collectors.toList());
        System.out.println("Number strings: " + numberStrings);
    }
}
