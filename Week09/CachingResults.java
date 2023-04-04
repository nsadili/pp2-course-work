import java.util.*;

public class CachingResults {
    private static Map<String, Pair<Character, Character>> cache = new HashMap<>();

    public static Pair<Character, Character> getFrequentChars(String s) {
        if (cache.containsKey(s)) {
     
            return cache.get(s);
        }

 
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFreq = '\0', leastFreq = '\0';
        int mostFreqCount = Integer.MIN_VALUE, leastFreqCount = Integer.MAX_VALUE;
        for (char c : freqMap.keySet()) {
            int freqCount = freqMap.get(c);
            if (freqCount > mostFreqCount) {
                mostFreq = c;
                mostFreqCount = freqCount;
            }
            if (freqCount < leastFreqCount) {
                leastFreq = c;
                leastFreqCount = freqCount;
            }
        }

        Pair<Character, Character> result = new Pair<>(mostFreq, leastFreq);

 
        cache.put(s, result);

        return result;
    }
}







