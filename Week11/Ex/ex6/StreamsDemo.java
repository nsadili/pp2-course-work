package Ex.ex6;

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

        String[] names = { "ravan", "nasib", "cavid" };

        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new HashSet<>(Arrays.asList(18, 55, 55, 44, 66, 8, 75, 45));

        var agesStream = ages.stream();

        // Map<String, Integer> map = new HashMap<>();

        // map.entrySet().stream();

        // System.out.println( namesStream.anyMatch(name -> name.startsWith("x")));

        // System.out.println(namesStream.noneMatch(name -> name.equals("nasib")));


        final Random randGen = new Random();

        Supplier<Integer> supp = () -> new Random().nextInt(6) + 1;

       var testStream =  Stream.generate(supp).limit(10);
       
       testStream.forEach(num -> System.out.println(num));

       






    }
    }

