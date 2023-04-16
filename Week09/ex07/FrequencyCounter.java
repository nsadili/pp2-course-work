package Week09.ex07;

import java.util.*;

public class FrequencyCounter {
    
    private static Map<String, Map.Entry<Character, Character>> cache = new HashMap<>();
    
    public static Map.Entry<Character, Character> getMostAndLeastFrequentChars(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Cache hit for string: " + str);
            return cache.get(str);
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        Character mostFreqChar = null;
        Character leastFreqChar = null;
        int mostFreqCount = 0;
        int leastFreqCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value > mostFreqCount) {
                mostFreqChar = key;
                mostFreqCount = value;
            }
            if (value < leastFreqCount) {
                leastFreqChar = key;
                leastFreqCount = value;
            }
        }
        
        Map.Entry<Character, Character> result = new AbstractMap.SimpleEntry<>(mostFreqChar, leastFreqChar);
        cache.put(str, result);
        System.out.println("Cached result for string: " + str);
        return result;
    }
    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Input String: " + str);
        
        Map.Entry<Character, Character> result1 = getMostAndLeastFrequentChars(str);
        System.out.println("Most frequent char: " + result1.getKey() + ", Least frequent char: " + result1.getValue());
        
        Map.Entry<Character, Character> result2 = getMostAndLeastFrequentChars(str);
        System.out.println("Most frequent char: " + result2.getKey() + ", Least frequent char: " + result2.getValue());
        
        String str2 = "A long sentence...";
        System.out.println("Input String: " + str2);
        
        Map.Entry<Character, Character> result3 = getMostAndLeastFrequentChars(str2);
        System.out.println("Most frequent char: " + result3.getKey() + ", Least frequent char: " + result3.getValue());
        
        Map.Entry<Character, Character> result4 = getMostAndLeastFrequentChars(str2);
        System.out.println("Most frequent char: " + result4.getKey() + ", Least frequent char: " + result4.getValue());
    }
}
