package week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharactersOfAWord {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharactersOfAWord(String word) {
        if (cache.containsKey(word)) {
            System.out.println("Retrieving result: " + word);
            return cache.get(word);
        }

        System.out.println("Calculating result: " + word);
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        cache.put(word, uniqueChars);
        return uniqueChars;
    }

    public static void main(String[] args) {
        String word = "Blueberry";
        List<Character> uniqueChars = getUniqueCharactersOfAWord(word);
        System.out.println("Unique characters of " + word + ": " + uniqueChars);
        
        uniqueChars = getUniqueCharactersOfAWord(word);
        System.out.println("Unique characters of " + word + " (from cache): " + uniqueChars);
    }
}

