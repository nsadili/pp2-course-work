package Week09.ex08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String word) {
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
        cache.put(word, uniqueChars);
        return uniqueChars;
    }

    public static void main(String[] args) {
        String word = "Sadiqqq";
        List<Character> uniqueChars = getUniqueCharacters(word);
        System.out.println("Unique characters of " + word + " are: " + uniqueChars);
    }
}