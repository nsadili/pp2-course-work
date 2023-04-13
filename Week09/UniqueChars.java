import java.util.*;

public class UniqueChars {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueChars(String str) {
        if (cache.containsKey(str)) {
            // return cached result
            return cache.get(str);
        }

        List<Character> uniqueChars = new ArrayList<>();
        Set<Character> seenChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seenChars.contains(c)) {
                uniqueChars.add(c);
                seenChars.add(c);
            }
        }

        // cache result
        cache.put(str, uniqueChars);

        return uniqueChars;
    }
}
