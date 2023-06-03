package EX;

import java.util.HashMap;
import java.util.Map;

public class CoachingResult {
    private final Map<String, Pair<Character, Character>> cache;

    public CoachingResult() {
        cache = new HashMap<>();
    }

    public Pair<Character, Character> analyze(String str) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        int[] charCounts = new int[128];
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        char mostFrequent = 0;
        char leastFrequent = 0;
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < 128; i++) {
            if (charCounts[i] > maxCount) {
                mostFrequent = (char) i;
                maxCount = charCounts[i];
            }
            if (charCounts[i] > 0 && charCounts[i] < minCount) {
                leastFrequent = (char) i;
                minCount = charCounts[i];
            }
        }

        Pair<Character, Character> result = new Pair<>(mostFrequent, leastFrequent);
        cache.put(str, result);
        return result;
    }
}
