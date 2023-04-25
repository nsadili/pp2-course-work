package Week11.HW;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo {

    private static final String Arrays = null;

    public static void main(String[] args) {
        String[] names = { "Nuraddin", "Teymur", "Naik", "Laman", "Nariman"};
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages = new Set<>(Arrays.asList(18, 19, 19, 21, 18));
        Stream<Integer> agesStream = ages.stream();

    // Map<String, Integer> map = new HashMap<>();

    // System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));
   //  System.out.println(namesStream.noneMatch(name -> name.equals("Nuraddin")));

    }
    
}
