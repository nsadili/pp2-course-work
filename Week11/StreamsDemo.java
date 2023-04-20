import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        String[] names = { "Nuraddin", "Fred", "Jack" };
        var namesStream = Arrays.stream(names);
        // List x=Arrays.asList()
        Set<Integer> ages = new HashSet<>(Arrays.asList(19, 19, 20, 33, 33, 55, 32, 55, 11));
        var agesStream = ages.stream();
        //Map<String, Integer> map= new HashMap<>();
        //System.out.println(namesStream.anyMatch(name->name.startsWith("N")));
        //System.out.println(namesStream.noneMatch(name->name.equals("Nuraddin")));
        final Random ranGen = new Random();
        Supplier<Integer> supplier=() -> ranGen.nextInt(6)+1;
        var testStream=Stream.generate(supplier).limit(10);
        testStream.forEach(System.out::println);
        Optional<Integer> foundAge= agesStream
                .filter(age->age>20)
                .findAny();
        System.out.println(
            foundAge.isPresent()
                    ? foundAge.get()
                    : "Not Found"
        );
        foundAge.ifPresentOrElse(
                System.out::println,
                ()->System.out.println("Not Found"));

    }

}
