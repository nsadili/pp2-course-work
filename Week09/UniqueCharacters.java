import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String input) {
        // Check if the result is already cached
        if (cache.containsKey(input)) {
            System.out.println("Result retrieved from cache");
            return cache.get(input);
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        // Cache the result
        cache.put(input, uniqueChars);
        System.out.println("Result calculated and cached");
        return uniqueChars;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "world";
        
        List<Character> uniqueChars1 = getUniqueCharacters(input1);
        System.out.println("Unique characters of input1: " + uniqueChars1);
        
        List<Character> uniqueChars2 = getUniqueCharacters(input2);
        System.out.println("Unique characters of input2: " + uniqueChars2);
        
        // Calling the method again with the same input1 should retrieve the result from cache
        List<Character> uniqueChars1FromCache = getUniqueCharacters(input1);
        System.out.println("Unique characters of input1 from cache: " + uniqueChars1FromCache);
    }
}
