import java.util.*;

public class StringFrequencies {
    private static Map<String, Map.Entry<Character, Integer>[]> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "hello world";
        Map.Entry<Character, Integer>[] frequencies = getFrequencies(input);
        System.out.println("Most frequent: " + frequencies[0].getKey() + " (" + frequencies[0].getValue() + " )");
        System.out.println("Least frequent: " + frequencies[1].getKey() + " (" + frequencies[1].getValue() + " )");
        Map.Entry<Character, Integer>[] cachedFrequencies = getFrequencies(input);
        System.out.println("Cached results:");
        System.out.println("Most frequent: " + cachedFrequencies[0].getKey() + " (" + cachedFrequencies[0].getValue() + " )");
        System.out.println("Least frequent: " + cachedFrequencies[1].getKey() + " (" + cachedFrequencies[1].getValue() + " )");
    }

    public static Map.Entry<Character, Integer>[] getFrequencies(String input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        Map.Entry<Character, Integer>[] entries = charCounts.entrySet().toArray(new Map.Entry[charCounts.size()]);
        Arrays.sort(entries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        Map.Entry<Character, Integer>[] results = new Map.Entry[2];
        results[0] = entries[0];
        results[1] = entries[entries.length - 1];

        cache.put(input, results);

        return results;
    }
}
