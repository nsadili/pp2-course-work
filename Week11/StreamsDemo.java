import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        String[] names = { "Bahruz", "Yusif", "Orxan" };

        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(12, 34, 44, 53, 66,43, 65, 45));

        var agesStream = ages.stream();

        final Random randGen = new Random();

        Supplier<Integer> supp = () -> new Random().nextInt(4) + 1;

       var testStream =  Stream.generate(supp).limit(10);
       
       testStream.forEach(num -> System.out.println(num));
       
    }
    }
