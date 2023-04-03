import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachingResults {   
      
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String inputString) {
        // Check if the result is already in the cache
        if (cache.containsKey(inputString)) {
            System.out.println("Retrieving result from cache");
            return cache.get(inputString);
        }

        // Otherwise, compute the result and store it in the cache
        List<Character> uniqueCharacters = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (!uniqueCharacters.contains(c)) {
                uniqueCharacters.add(c);
            }
        }

        cache.put(inputString, uniqueCharacters);
        return uniqueCharacters;
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        List<Character> result = getUniqueCharacters(inputString);
        System.out.println("Unique characters: " + result);

        // Call the method again with the same input string
        result = getUniqueCharacters(inputString);
        System.out.println("Unique characters: " + result);
    }
}


