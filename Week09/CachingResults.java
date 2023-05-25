package Week09;

import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    private static Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public static void main(String[] args) {
        String inputString = "Hello World";
        System.out.println("Input string: " + inputString);
        Map<Character, Integer> frequencies = getFrequencies(inputString);
        System.out.println("Most frequent character(s): " + getMostFrequent(frequencies));
        System.out.println("Least frequent character(s): " + getLeastFrequent(frequencies));
    }

    public static Map<Character, Integer> getFrequencies(String inputString) {
        if (cache.containsKey(inputString)) {
            System.out.println("Result fetched from cache for " + inputString);
            return cache.get(inputString);
        }

        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : inputString.toCharArray()) {
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }
        cache.put(inputString, frequencies);
        return frequencies;
    }

    public static String getMostFrequent(Map<Character, Integer> frequencies) {
        int maxFreq = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
                sb = new StringBuilder();
                sb.append(entry.getKey());
            } else if (freq == maxFreq) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    public static String getLeastFrequent(Map<Character, Integer> frequencies) {
        int minFreq = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            int freq = entry.getValue();
            if (freq < minFreq) {
                minFreq = freq;
                sb = new StringBuilder();
                sb.append(entry.getKey());
            } else if (freq == minFreq) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
