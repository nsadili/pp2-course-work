package Week11.Ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] names = { "Shamil", "Vusal", "Leyla", "Elvin", "Vugar" };
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> set = new HashSet<>(Arrays.asList( 6, 7, 3, 9, 1, 2, 8, 4, 5));
        Stream<Integer> setStream = set.stream();

        List<Color> colors = Arrays.asList(
            new Color(255, 255, 255),
            new Color(0, 0, 0),
            new Color(127, 127, 127),
            new Color(0, 0, 255));
        Stream<Color> colorsStream = colors.stream();

        System.out.println(namesStream.allMatch(s -> s.startsWith("V")));
        System.out.println(namesStream.anyMatch(s -> s.startsWith("V")));
        System.out.println(namesStream.noneMatch(s -> s.startsWith("V")));

        System.out.println(setStream.count());

        Random randGenerator = new Random();
        Supplier<Integer> rand = ()->randGenerator.nextInt(10)+1;
        Stream<Integer> randomStream = Stream.generate(rand).limit(5);
        randomStream.forEach(System.out::println);

        Optional<Color> op = colorsStream.findAny();
        System.out.println(op.get()); 

        // System.out.println(namesStream.findFirst());

        // System.out.println(
        //     op.isPresent()
        //         ? op.get() 
        //         : "Not found" 
        // );

        // setStream.filter(n->n%2!=0).forEach(System.out::println);

        // System.out.println(setStream.filter(n->n%2!=0).filter(n->n>4).count());

        // setStream.filter(n->n%2!=0).sorted().forEach(System.out::println);

        setStream.filter(n->n%2!=0).sorted().map(n->n+2).forEach(System.out::println);



    }
}
