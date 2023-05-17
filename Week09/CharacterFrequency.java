import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    private static Map<String, CharacterResult> cache = new HashMap<>();

    public static void main(String[] args) {
        String inputString = "Hello World";

        // Find the most and least frequent characters of the string
        CharacterResult result = findFrequentCharacters(inputString);

        // Print the result
        System.out.println("Most frequent character: " + result.mostFrequent);
        System.out.println("Least frequent character: " + result.leastFrequent);
    }

    public static CharacterResult findFrequentCharacters(String input) {
        // Check if the result is already cached
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        // Calculate the character frequencies
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (char c : input.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Find the most and least frequent characters
        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
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

        // Create the result object
        CharacterResult result = new CharacterResult(mostFrequent, leastFrequent);

        // Cache the result for future use
        cache.put(input, result);

        // Return the result
        return result;
    }

    private static class CharacterResult {
        private char mostFrequent;
        private char leastFrequent;

        public CharacterResult(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }
    }
}
