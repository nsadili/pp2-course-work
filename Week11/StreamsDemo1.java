package Week11;

import java.util.Arrays;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsDemo1 {
    
    public static void main(String[] args) {

        String[] names= {"Leyla","Rustam","Bakhtiyar"};
         try (Stream<String> namesStream = Arrays.stream(names)) {
        }

     Set<Integer> set = new HashSet<>( Arrays.asList(1,2,3,4,5,6,7));
       try (Stream<Integer> numsStream = set.stream()) {
    }
       
List<Color> colors= Arrays.asList(
new Color(255,255,255),
new Color(0,0,0),
new Color(0,0,255)
);
 try (Stream<Color> colorStream = colors.stream()) {
}

//namesStream.allMatch(s->s.startsWith("L"));
//namesStream.allMatch(s->s.startsWith("R"));
//System.out.println(numsStream.count());

       
Random randomGenerator= new Random();
Supplier<Integer> rand= () -> randomGenerator.nextInt(4)+1;
try (Stream<Integer> randomStream = Stream.generate(rand).limit(10)) {
}
    }
}

