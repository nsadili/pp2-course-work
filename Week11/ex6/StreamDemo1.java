import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class StreamDemo1{
    public static void main(String[] args) {
        String[] names = {"Shamil", "Vusal", "Leyla", "Nariman", "Rufat"};
        Stream<String> namesStream = Arrays.stream(names); // sending to stream

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,5,5,6,7));
        Stream<Integer> numStream  = set.stream(); //sending to stream

        List<Color> colors = Arrays.asList(
            new Color(255,255,255),
            new Color(0,2,0),
            new Color(127,127,127),
            new Color(0,0,127)
        );
        Stream<Color> colorStream = colors.stream();

        // Map<String, Integer> wordCounts = new HashMap<>();

        // System.out.println(namesStream.noneMatch(str -> str.startsWith("A")));

        // System.out.println(numStream.count());


        Supplier<Integer> rand = () -> new Random().nextInt(10)+1;
        Stream<Integer> randomStream = Stream.generate(rand).limit(4);

        // randomStream.forEach(num-> System.out.println(num)); // 1
        // randomStream.forEach(System.out::println); //2

        Optional<Color> res = colorStream.filter(c->c.getR()==0).findFirst();
        
        // if(res.isPresent()){
        //     System.out.println(res.get());
        // } else {
        //     System.out.println("NOT FOUND");
        // }

        // System.out.println(
        //     res.isPresent() ? res.get() : "NOT FOUND"
        // );

        // res.ifPresent(System.out::println);
        res.ifPresentOrElse(System.out::println, ()-> System.out.println("NOT FOUND")); // runnable nothing -> nothing


        // numStream.filter(num->num%2!=0).filter(num->num>4).forEach(System.out::println);
        Set<Integer> set1 = numStream.filter(num->num%2!=0).map(num -> num+1).collect(Collectors.toSet());
        System.out.println(set1);

            

        

    }
}