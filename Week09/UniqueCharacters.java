package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private Map<String, List<Character>> cache;

    public UniqueCharacters() {
        cache = new HashMap<>();
    }

    public List<Character> getUniqueCharacters(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Retrieving result from cache for input: " + input);
            return cache.get(input);
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        cache.put(input, uniqueChars);
        System.out.println("Adding result to cache for input: " + input);

        return uniqueChars;
    }
}

