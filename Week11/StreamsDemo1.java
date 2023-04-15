package week11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {
        String [] names = {"Ulkar", "Nijat", "Rovshan", "Tural", "Nigar" };
        Stream<String> namesStream = Arrays.stream(names);

        Set<Integer>set = new HashSet<>(Arrays.asList(1, 4, 5, 6, 8, 4, 2));
                Stream<Integer> numsStream= set.stream();

        List<Color> colors = Arrays.asList(
                new Color(255, 255, 255),
                        new Color(0, 0, 0),
                new Color(127, 127, 127));
        Stream<Color> colorStream= colors.stream();

        namesStream.allMatch(s -> s.startsWith("N"));
    }
}
