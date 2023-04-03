import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    
    private static Map<String, Character[]> cache = new HashMap<>();
    
    public static Character[] mostAndLeastFrequentCharacters(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Answer fetched from cache");
            return cache.get(str);
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        Character mostFreqChar = null;
        Character leastFreqChar = null;
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            Character ch = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxCount) {
                maxCount = count;
                mostFreqChar = ch;
            }
            
            if (count < minCount) {
                minCount = count;
                leastFreqChar = ch;
            }
        }
        
        Character[] result = {mostFreqChar, leastFreqChar};
        cache.put(str, result);
        return result;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        Character[] result = mostAndLeastFrequentCharacters(str);
        System.out.println("The Most frequent character: " + result[0]);
        System.out.println("The Least frequent character: " + result[1]);
        
        Character[] cachedResult = mostAndLeastFrequentCharacters(str);
        System.out.println("The Most frequent character (cached): " + cachedResult[0]);
        System.out.println("The Least frequent character (cached): " + cachedResult[1]);
    }
}
