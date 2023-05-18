import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    private static Map<String, Result> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "Hello World";

        // Test the method
        Result result = getMostAndLeastFrequentCharacters(input);
        System.out.println("Most frequent character: " + result.getMostFrequent());
        System.out.println("Least frequent character: " + result.getLeastFrequent());

        // Test the caching mechanism
        Result cachedResult = getMostAndLeastFrequentCharacters(input);
        System.out.println("Most frequent character (from cache): " + cachedResult.getMostFrequent());
        System.out.println("Least frequent character (from cache): " + cachedResult.getLeastFrequent());
    }

    public static Result getMostAndLeastFrequentCharacters(String input) {
        if (cache.containsKey(input)) {
            // Return the cached result if it exists
            return cache.get(input);
        }

        // Calculate the character frequency
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the most and least frequent characters
        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequent = character;
                maxFrequency = frequency;
            }

            if (frequency < minFrequency) {
                leastFrequent = character;
                minFrequency = frequency;
            }
        }

        // Create the result object
        Result result = new Result(mostFrequent, leastFrequent);

        // Cache the result for future use
        cache.put(input, result);

        return result;
    }

    private static class Result {
        private char mostFrequent;
        private char leastFrequent;

        public Result(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }

        public char getMostFrequent() {
            return mostFrequent;
        }

        public char getLeastFrequent() {
            return leastFrequent;
        }
    }
}
