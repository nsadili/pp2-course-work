package Week11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo1 {

    public static void main(String[] args) {
        
        String[] names = { "Shamil", "Vusal", "Leyla", "Elvin", "Vugar"};
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 4, 5, 6, 8, 4, 2));
        Stream<Integer> numStream = set.stream();
    }
    
}
