package Week09;

import java.util.HashMap;
import java.util.Map;

public class CatchingResults {
    public static void main(String[] args) {
            
        String input1 = "Hello, World!";
        String input2 = "The quick brown fox jumps over the lazy dog.";
        String input3 = "To be or not to be, that is the question.";

        String result1 = CatchingResults.frequentChars(input1);
        System.out.println(result1);

        String result2 = CatchingResults.frequentChars(input2);
        System.out.println(result2);

        String result3 = CatchingResults.frequentChars(input3);
        System.out.println(result3);

        String result4 = CatchingResults.frequentChars(input1);
        System.out.println(result4);
    }

    private static Map<String, String> cache = new HashMap<>();

    public static String frequentChars(String string) {
        if(cache.containsKey(string)) {
            System.out.println("Retrieving results from cache for string: " + string);
            return cache.get(string);
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : string.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        char leastFrequent = ' ';
        int maxCount = 0;
        int minCount = string.length() + 1;

        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > maxCount) {
                mostFrequent = c;
                maxCount = count;
            }
            if (count < minCount) {
                leastFrequent = c;
                minCount = count;
            }
        }
        
        String result = "Most frequent character: " + mostFrequent + ", Least frequent character: " + leastFrequent;
        cache.put(string, result);
        return result;
    }

}
