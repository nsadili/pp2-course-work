import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private Map<String, List<Character>> cache = new HashMap<>();

    public List<Character> getUniqueCharacters(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Returning cached result for " + str);
            return cache.get(str);
        }
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!result.contains(c)) {
                result.add(c);
            }
        }
        cache.put(str, result);
        System.out.println("Calculated result for " + str + " and added to cache");
        return result;
    }

    public static void main(String[] args) {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        String testStr = "this is an example sentence";
        List<Character> uniqueChars = uniqueCharacters.getUniqueCharacters(testStr);
        System.out.println("Unique characters of " + testStr + ": " + uniqueChars);
        uniqueChars = uniqueCharacters.getUniqueCharacters(testStr);
        System.out.println("Unique characters of " + testStr + " (from cache): " + uniqueChars);
    }
}
