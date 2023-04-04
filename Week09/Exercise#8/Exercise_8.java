import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Exercise_8 {

    public static void main(String[] args) {
        String input = "Hello World!";
        List<Character> uniqueChars = getUniqueCharacters(input);
        System.out.println("Unique characters of \"" + input + "\": " + uniqueChars);
    }

    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Using cached result for input: " + input);
            return cache.get(input);
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        List<Character> uniqueCharsList = new ArrayList<>(uniqueChars);
        cache.put(input, uniqueCharsList);
        return uniqueCharsList;
    }
}
