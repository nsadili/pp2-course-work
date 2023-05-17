import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachingResults {
    private static Map<String, List<Character>> cache = new HashMap<>();

public static List<Character> getUniqueCharacters(String inputString) {
    if (cache.containsKey(inputString)) {
        System.out.println("Retrieving result from cache");
        return cache.get(inputString);
    }

    List<Character> uniqueCharacters = computeUniqueCharacters(inputString);
    cache.put(inputString, uniqueCharacters);
    return uniqueCharacters;
}

private static List<Character> computeUniqueCharacters(String inputString) {
    List<Character> uniqueCharacters = new ArrayList<>();
    for (int i = 0; i < inputString.length(); i++) {
        char c = inputString.charAt(i);
        if (!uniqueCharacters.contains(c)) {
            uniqueCharacters.add(c);
        }
    }
    return uniqueCharacters;
}

public static void main(String[] args) {
    String inputString = "Good Day";
    List<Character> result = getUniqueCharacters(inputString);
    System.out.println("Unique characters: " + result);

    result = getUniqueCharacters(inputString);
    System.out.println("Unique characters: " + result);
}

}