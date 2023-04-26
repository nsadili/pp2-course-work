import java.util.*;
import java.util.stream.Stream;
public class StreamAPI {
    String[] names = {"Shamil", "Vusal", "Leyla", "Elvin", "Vuqar"};
    Stream<String> namesStream = Arrays.stream(names);

    Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Stream<Integer> streamSet = set.stream();

    List<Color> colors = Arrays.asList(
        new Color(255, 255, 255),
        new Color(0, 0, 0)
    )

    Stream<Color> colorStream = colors.stream();

    Map<String, Integer> wordCounts = new HashMap<>();

    namesStream.allMatch(s -> s.startsWith("V")); // all those meet requirement - allMatch
                                                    // those meet requirement - anyMatch
    numsStream.count(); // for counting

    


}

// it gives opportunity to work with arrays or list and it works with copy of
// element and edit based on function

// Intermediate operation -> we have stream and manupilate and get another
// stream (for instance filter or map)
// Termination operation -> you have stream and we decreasing (collect, reduce,
// foreach)
// Aim is for using many operation in a line as a chain
