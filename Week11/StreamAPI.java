package Week11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 3, 2, 1));
        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::print);

        System.out.println();

        Stream<Integer> stream2 = numbers.stream().sorted();
        stream2.forEach(System.out::print);

        System.out.println();

        Stream<Integer> stream3 = numbers.stream();
        System.out.println(stream3.max(Comparator.comparingInt(o -> o)));



        Stream<Integer> stream4 = numbers.stream();
        System.out.println(stream4.allMatch(element -> element > 0));


        Stream<Integer> stream5 = numbers.stream();
        System.out.println(stream5.count());


        Stream<Integer> stream6 = numbers.stream();
        stream6.limit(2).forEach(System.out::print);


    }
}