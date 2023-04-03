import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    private static final Map<String, Character[]> cache = new HashMap<>();

    public static Character[] findMostAndLeastFrequentChars(String input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        Character mostFrequentChar = null;
        Character leastFrequentChar = null;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            Character c = entry.getKey();
            int count = entry.getValue();

            if (mostFrequentChar == null || count > charFrequency.get(mostFrequentChar)) {
                mostFrequentChar = c;
            }

            if (leastFrequentChar == null || count < charFrequency.get(leastFrequentChar)) {
                leastFrequentChar = c;
            }
        }

        Character[] result = { mostFrequentChar, leastFrequentChar };
        cache.put(input, result);
        return result;
    }
}