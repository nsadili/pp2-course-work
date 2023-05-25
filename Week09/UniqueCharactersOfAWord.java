package Week09;

import java.util.*;

public class UniqueCharactersOfAWord {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueChars(String s) {
        if (cache.containsKey(s)) {
   
            return cache.get(s);
        }

      
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        List<Character> result = new ArrayList<>(charSet);

    
        cache.put(s, result);

        return result;
    }
}
