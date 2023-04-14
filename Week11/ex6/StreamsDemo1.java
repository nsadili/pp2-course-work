package ex6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {

    public static void main(String[] args) {

        String[] names = { "Shamil", "Vusal", "Leyla", "Elvin", "Vuqar" };

        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 4, 5, 6, 9, 3, 8, 4, 2));

        Stream<Integer> numsStream = set.stream();

        List<Color> colors = Arrays.asList(new Color(255, 255, 255),
                new Color(0, 0, 0),
                new Color(127, 127, 127),
                new Color(0, 0, 225)

        );

        Stream<Color> colorStream = colors.stream();

        // Map<String, Integer> wordCount = new HashMap<>();

        // Stream mapStream = wordCount.entrySet().stream();

        // System.out.println(namesStream.noneMatch(s -> s.startsWith("N")));

        // System.out.println(numsStream.count());

        Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(10)).limit(5);

        // randomStream.forEach(System.out :: println);

        Optional<Color> res = colorStream.filter(c -> c.getR()==0).findFirst();

        // System.out.println(

        // res.isPresent() ? res.get()
        // : "Not found anything"

        // );

        // res.ifPresentOrElse(System.out::println,() -> System.out.println("No such color"));


    
            // numsStream.filter(n -> n%2==0).map(n -> n+1).forEach(System.out :: println);
          Set<Integer> result=  numsStream.filter(n -> n%2==0).map(n -> n+1).collect( Collectors.toSet() );
          System.out.println(result);

            



            
            




    }

}