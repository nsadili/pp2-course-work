package EX;
import java.util.*;

public class UniqueCharacters {
    
    private static Map<String, List<Character>> cache = new HashMap<>();



    public static List<Character> getUniqueCharacters(String str) {
        if (cache.containsKey(str)) {
        
            return cache.get(str);
        
        
        }



        List<Character> uniqueChars = new ArrayList<>();
        Set<Character> seenChars = new HashSet<>();



        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seenChars.contains(c)) {
                uniqueChars.add(c);
                seenChars.add(c);
        
            }


        }



        cache.put(str, uniqueChars);
        return uniqueChars;
    }
}

