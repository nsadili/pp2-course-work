import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachingResults {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "Hello world";
        List<Character> res = uniqueChar(input);
        System.out.println("Unique chars " + res);

        res = uniqueChar(input);
        System.out.println("Unique cache characters " + res);
    }

    public static List<Character> uniqueChar(String input) {
        List<Character> getChar = cache.get(input);
        if (getChar != null) {
            System.out.println();
            return getChar;
        }

        getChar = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!getChar.contains(c)) {
                getChar.add(c);
            }
        }
        cache.put(input, getChar);
        return getChar;
    }
}