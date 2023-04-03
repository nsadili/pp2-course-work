import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    private static Map<String, Character[]> cache = new HashMap<>();

    public static Character[] getMostAndLeastFrequentChars(String input) {

        // Check if the result is already in cache
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = 0;
        char leastFrequent = 0;
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                mostFrequent = c;
                maxCount = count;
            }
            if (count < minCount) {
                leastFrequent = c;
                minCount = count;
            }
        }

        Character[] result = new Character[]{mostFrequent, leastFrequent};
        cache.put(input, result);
        return result;
    }

    public static void main(String[] args) {
        String input = "hello world";
        Character[] result = getMostAndLeastFrequentChars(input);
        System.out.println("Most frequent char: " + result[0]); // l
        System.out.println("Least frequent char: " + result[1]); // h

        // should return the result from cache
        result = getMostAndLeastFrequentChars(input);
        System.out.println("Most frequent char: " + result[0]); // l
        System.out.println("Least frequent char: " + result[1]); // h
    }
}

