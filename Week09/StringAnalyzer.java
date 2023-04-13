import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringAnalyzer {
    
    private Map<String, Entry<Character, Character>> cache = new HashMap<>();
    
    public Entry<Character, Character> getFrequentCharacters(String input) {
        // If the answer has already been evaluated for this string, return it from cache
        if (cache.containsKey(input)) {
            return cache.get(input);
        }
        
        // Count the frequency of each character in the string
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the most frequent and least frequent characters
        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = 0;
        int minFrequency = input.length() + 1;
        for (Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                mostFrequent = c;
                maxFrequency = frequency;
            }
            if (frequency < minFrequency) {
                leastFrequent = c;
                minFrequency = frequency;
            }
        }
        
        // Store the answer in cache and return it
        Entry<Character, Character> result = Map.entry(mostFrequent, leastFrequent);
        cache.put(input, result);
        return result;
    }
}
