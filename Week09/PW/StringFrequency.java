import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    private static Map<String, char[]> cache = new HashMap<>();

    public static char[] getMostAndLeastFrequentChars(String str) {
        System.out.println("a. Write a method which will take a string as input argument and return the most and the least frequent characters of it.");
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char mostFreq = 0, leastFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[mostFreq]) {
                mostFreq = (char) i;
            } else if (freq[i] > 0 && freq[i] < freq[leastFreq]) {
                leastFreq = (char) i;
            }
        }
        System.out.println("b. As this method might be passed in the same string multiple times, introduce a caching mechanism. So, if the same string is passed into the method for the first time, the answer will be evaluated. However, if the answer has been evaluated once, the next calls will use the answer from cache.");
        char[] result = { mostFreq, leastFreq };
        cache.put(str, result);
        return result;

    }
}
