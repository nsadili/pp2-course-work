package ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        String[] names = { "n", "c" };

        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> ages= new HashSet<>(Arrays.asList(18,19,19,21,18));
        ages.stream();
    }
}
