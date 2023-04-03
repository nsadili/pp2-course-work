package Week09.PW;

import java.util.HashMap;
import java.util.Map;

public class ChackingResult {
    private static Map<String, Character[]> cache = new HashMap<>();

    public static Character[] getMostAndLeastCommonChars(String str) {
    
        if (cache.containsKey(str)) {
            return cache.get(str);
        }
        
 
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        Character mostCommon = null;
        Character leastCommon = null;
        int highestCount = 0;
        int lowestCount = Integer.MAX_VALUE;
        
        for (Character c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > highestCount) {
                mostCommon = c;
                highestCount = count;
            }
            if (count < lowestCount) {
                leastCommon = c;
                lowestCount = count;
            }
        }
        
        Character[] result = new Character[] {mostCommon, leastCommon};
        cache.put(str, result);
        return result;
    }
}

