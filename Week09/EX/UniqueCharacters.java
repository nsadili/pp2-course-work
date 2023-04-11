import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String word) {
        System.out.println("a. Write a method which will take a string as input argument and return the list of unique characters of it.");
        if (cache.containsKey(word)) {
            return cache.get(word);
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
            }
        }
        System.out.println("b. As this method might be passed in the same string multiple times, introduce a caching mechanism. So, if the same string is passed into the method for the first time, the answer will be evaluated. However, if the answer has been evaluated once, the next calls will use the answer from cache.");
        cache.put(word, uniqueChars);
        return uniqueChars;
    }
}
