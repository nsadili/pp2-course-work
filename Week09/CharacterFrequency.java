import java.util.*;

public class CharacterFrequency {
    private static Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public static Map.Entry<Character, Integer>[] getMostAndLeastFrequentChars(String str) {
        if (cache.containsKey(str)) {
            Map<Character, Integer> charCounts = cache.get(str);
            return getMostAndLeastFrequentCharsHelper(charCounts);
        } else {
            Map<Character, Integer> charCounts = new HashMap<>();
            for (char c : str.toCharArray()) {
                if (!charCounts.containsKey(c)) {
                    charCounts.put(c, 1);
                } else {
                    charCounts.put(c, charCounts.get(c) + 1);
                }
            }
            cache.put(str, charCounts);
            return getMostAndLeastFrequentCharsHelper(charCounts);
        }
    }

    private static Map.Entry<Character, Integer>[] getMostAndLeastFrequentCharsHelper(Map<Character, Integer> charCounts) {
        List<Map.Entry<Character, Integer>> charCountsList = new ArrayList<>(charCounts.entrySet());

        Collections.sort(charCountsList, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        Map.Entry<Character, Integer>[] result = new Map.Entry[2];
        result[0] = charCountsList.get(0);
        result[1] = charCountsList.get(charCountsList.size() - 1);
        return result;
    }
}
