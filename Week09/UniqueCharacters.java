import java.util.*;

public class UniqueCharacters {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String str) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        } else {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }
            List<Character> result = new ArrayList<>(uniqueChars);
            cache.put(str, result);
            return result;
        }
    }
}
