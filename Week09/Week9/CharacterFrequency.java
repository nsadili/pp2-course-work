package Week9;

import java.util.*;

public class CharacterFrequency {
    
    private static Map<String, Map.Entry<Character, Character>> cache = new HashMap<>();
    
    public static Map.Entry<Character, Character> getMostAndLeastFrequentCharacters(String str) {
        
        if (cache.containsKey(str)) {
            System.out.println("Result found in cache.");
            return cache.get(str);
        }
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        char mostFrequent = ' ';
        char leastFrequent = ' ';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
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
        
        Map.Entry<Character, Character> result = new AbstractMap.SimpleEntry<>(mostFrequent, leastFrequent);
        cache.put(str, result);
        System.out.println("Result computed and cached.");
        return result;
    }
    
    public static void main(String[] args) {
        
        String str = "hello world";
        Map.Entry<Character, Character> result1 = getMostAndLeastFrequentCharacters(str);
        System.out.println("Most frequent character: " + result1.getKey());
        System.out.println("Least frequent character: " + result1.getValue());
        
        // Call the method with the same string again
        Map.Entry<Character, Character> result2 = getMostAndLeastFrequentCharacters(str);
        System.out.println("Most frequent character: " + result2.getKey());
        System.out.println("Least frequent character: " + result2.getValue());
    }
}

