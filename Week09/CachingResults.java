package Week09;
import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    
    private static final Map<String, Character[]> cache = new HashMap<>();
    
    public static Character[] getMostAndLeastFrequentChars(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Retrieving from cache...");
            return cache.get(input);
        }
        char[] chars = input.toCharArray();
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : chars) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
        Character mostFrequent = null;
        Character leastFrequent = null;
        int highestCount = 0;
        int lowestCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequent = entry.getKey();
                highestCount = entry.getValue();
            }
            if (entry.getValue() < lowestCount) {
                leastFrequent = entry.getKey();
                lowestCount = entry.getValue();
            }
        }
        Character[] result = new Character[]{mostFrequent, leastFrequent};
        cache.put(input, result);
        return result;
    }

    public static void main(String[] args) {
        Character[] result1 = getMostAndLeastFrequentChars("HelloWorld!");
        System.out.println("Most frequent character: " + result1[0]);
        System.out.println("Least frequent character: " + result1[1]);
        

        Character[] result2 = getMostAndLeastFrequentChars("NuraddinSadili");
        System.out.println("Most frequent character: "+ result2[0]);
        System.out.println("Least frequent character: " + result2[1]);
        
        
        Character[] result3 = getMostAndLeastFrequentChars("Hello World!");
        System.out.println("Most frequent character (cached): " + result3[0]);
        System.out.println("Least frequent character (cached): " + result3[1]);
    }
    
}
