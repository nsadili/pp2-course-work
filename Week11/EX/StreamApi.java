import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        // Instantiating and initializing a stream of strings
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "api");

        // Using allMatch method with a lambda expression
        boolean allMatch = words.stream().allMatch(s -> s.length() > 2);
        System.out.println("All match: " + allMatch);

        // Using count method
        long count = words.stream().count();
        System.out.println("Count: " + count);

        // Using generate and limit methods with a lambda expression
        System.out.print("Random numbers: ");
        Arrays.stream(new int[10]).map(i -> (int) (Math.random() * 100)).limit(5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Using findFirst and ifPresentOrElse methods of Optional
        Optional<String> first = words.stream().findFirst();
        first.ifPresentOrElse(s -> System.out.println("First: " + s),
                () -> System.out.println("List is empty"));

        // Using filter, sorted, map, and collect methods with lambda expressions
        List<String> filtered = words.stream().filter(s -> s.length() > 4).sorted()
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Filtered and sorted: " + filtered);
    }
}
