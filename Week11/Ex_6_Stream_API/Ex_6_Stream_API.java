import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex_6_Stream_API {
    public static void main(String[] args) {
        //b. Here are some examples of Stream API methods that use lambda expressions:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter the list to get only even numbers
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        // Map each element to its square
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        // Sum all the elements in the list
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        //c. To instantiate a Stream, you can call the stream() method on any Collection object. For example:
        List<String> names = Arrays.asList("Murad", "Ibo", "Daris");
        Stream<String> stream = names.stream();

        int[] numbers2 = {1, 2, 3, 4, 5};
        IntStream stream2 = Arrays.stream(numbers2);

        //d. Here are some examples of Stream API methods:
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

            // Check if all numbers are even
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

            // Check if no numbers are negative
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);

        // Count the number of even numbers
        long count = numbers4.stream().filter(n -> n % 2 == 0).count();

        // Generate a stream of random numbers
        Stream<Integer> stream3 = Stream.generate(() -> new Random().nextInt()).limit(10);

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);

        // Print each number in the list
        numbers.stream().forEach(n -> System.out.println(n));

        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);

        // Find the first even number
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();

        // Find any even number
        Optional<Integer> anyEven = numbers.stream().filter(n -> n % 2 == 0).findAny();

        List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers2 = numbers7.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<String> strings = Arrays.asList("hello", "world", "java", "stream");
        List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());

        List<String> strings2 = Arrays.asList("hello", "world", "java", "stream");
        List<String> oStrings = strings.stream().filter(s -> s.contains("o")).collect(Collectors.toList());

        List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares2 = numbers.stream().map(n -> n * n).collect(Collectors.toList());



    }
}
