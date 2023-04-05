import java.util.HashMap;
import java.util.Map;

public class CachingResults {

    private static Map<String, CharPair> cache = new HashMap<>();

    public static CharPair getFrequentChars(String str) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = '\0', minChar = '\0';
        int maxCount = 0, minCount = Integer.MAX_VALUE;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                char ch = (char) i;
                if (freq[i] > maxCount) {
                    maxChar = ch;
                    maxCount = freq[i];
                }
                if (freq[i] < minCount) {
                    minChar = ch;
                    minCount = freq[i];
                }
            }
        }

        CharPair result = new CharPair(maxChar, minChar);
        cache.put(str, result);
        return result;
    }

    private static class CharPair {
        char mostFrequent;
        char leastFrequent;

        public CharPair(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }

    }
}
