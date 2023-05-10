package Week09;

import java.util.*;

public class CatchingResults {

    private static final Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Most and least frequent characters in \"" + str + "\": " + getMostAndLeastFrequentCharacters(str));
        System.out.println("Most and least frequent characters in \"" + str + "\": " + getMostAndLeastFrequentCharacters(str));
    }

    public static Map.Entry<Character, Character> getMostAndLeastFrequentCharacters(String str) {
        Map<Character, Integer> frequencyMap = cache.get(str);
        if (frequencyMap == null) {
            frequencyMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            cache.put(str, frequencyMap);
        }

        Map.Entry<Character, Integer> maxEntry = null;
        Map.Entry<Character, Integer> minEntry = null;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
            if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
                minEntry = entry;
            }
        }

        return new AbstractMap.SimpleEntry<>(maxEntry.getKey(), minEntry.getKey());
    }
}
