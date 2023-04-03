package Week09;
import java.util.HashMap;
import java.util.Map;

public class CacheResult {

    
    private static Map<String, char[]> cache = new HashMap<>();

    public static char[] mostAndLeastFrequentCharacters(String string) {
      
        if (cache.containsKey(string)) {
            return cache.get(string);
        }
        
       
        char[] result = new char[2];
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : string.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        char mostFrequent = ' ';
        char leastFrequent = ' ';
        int mostFrequency = 0;
        int leastFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > mostFrequency) {
                mostFrequency = frequency;
                mostFrequent = c;
            }
            if (frequency < leastFrequency) {
                leastFrequency = frequency;
                leastFrequent = c;
            }
        }
        result[0] = mostFrequent;
        result[1] = leastFrequent;
        
       
        cache.put(string, result);
        return result;
    }

    public static void main(String[] args) {
        String testString = "abbcccddddeeeee";
        char[] result = mostAndLeastFrequentCharacters(testString);
        System.out.println("Most frequent character: " + result[0]);
        System.out.println("Least frequent character: " + result[1]);
    }
}
