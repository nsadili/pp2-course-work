package ex6;

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
import pw1.SpecificProperty;

public class StreamDemo {
    public static void main(String[] args) {
        String[] names = { "Nuraddin", "Vusat", "Laman", "Nariman", "Vasila" };
        Stream<String> namesStream = Arrays.stream(names);
        Set<Integer> ages = new HashSet<>(Arrays.asList(1, 6, 3, 9, 34, 8, 2));
        var ageStream = ages.stream();
        List<Color> colors = Arrays.asList(
                new Color(255, 255, 255),
                new Color(0, 0, 0),
                new Color(127, 127, 127));
        Stream<Color> colorStream = colors.stream();
        // Map <String,Integer> map=new HashMap<>();
        // map.entrySet().stream();
        // System.out.println(namesStream.allMatch(str->str.startsWith("R")));
        // System.out.println(namesStream.anyMatch(name -> name.startsWith("N")));
        // System.out.println(namesStream.noneMatch(name -> name.equals("Nuraddin")));
        // System.out.println(ageStream.count());
        // Random randomGenerator = new Random();
        // Supplier<Integer> rand = () -> randomGenerator.nextInt(10);
        // Stream<Integer> randomStream = Stream.generate(rand).limit(5);
        // randomStream.forEach(System.out::println);
        Optional<Color> res = colorStream.filter(c -> c.getR() == 0).findFirst();
        // System.out.println(
        // res.isPresent()?res.get():"Not found!"
        // );
        // res.ifPresent(System.out::println);
        // res.ifPresentOrElse(System.out::println, ()->System.out.println("Nout
        // found!"));
        // ageStream.filter(age -> age % 2 == 0).filter(age -> age > 3).forEach(System.out::println);
        Set<Integer> result=ageStream.filter(num->num%2==0).map(num->num+1).collect(Collectors.toSet());
        System.out.println(result);
    }

}
