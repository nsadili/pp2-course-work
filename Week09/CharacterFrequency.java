import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    private static Map<String, Character[]> cache = new HashMap<>();

    public static Character[] findMostAndLeastFrequentCharacters(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Fetching result from cache for input: " + input);
            return cache.get(input);
        }

        Map<Character, Integer> charFrequency = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        char leastFrequent = ' ';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = c;
            }
            if (frequency < minFrequency) {
                minFrequency = frequency;
                leastFrequent = c;
            }
        }

        Character[] result = {mostFrequent, leastFrequent};
        cache.put(input, result);
        System.out.println("Calculating result and caching for input: " + input);
        return result;
    }

    public static void main(String[] args) {
        String input1 = "ababccc";
        String input2 = "hello";
        String input3 = "world";

        Character[] result1 = findMostAndLeastFrequentCharacters(input1);
        System.out.println("Most frequent character in " + input1 + ": " + result1[0]);
        System.out.println("Least frequent character in " + input1 + ": " + result1[1]);

        Character[] result2 = findMostAndLeastFrequentCharacters(input2);
        System.out.println("Most frequent character in " + input2 + ": " + result2[0]);
        System.out.println("Least frequent character in " + input2 + ": " + result2[1]);

        Character[] result3 = findMostAndLeastFrequentCharacters(input3);
        System.out.println("Most frequent character in " + input3 + ": " + result3[0]);
        System.out.println("Least frequent character in " + input3 + ": " + result3[1]);

        // Calling the method again with the same input should fetch the result from cache
        Character[] result1Cached = findMostAndLeastFrequentCharacters(input1);
        System.out.println("Most frequent character in " + input1 + " (from cache): " + result1Cached[0]);
        System.out.println("Least frequent character in " + input1 + " (from cache): " + result1Cached[1]);
    }
}
