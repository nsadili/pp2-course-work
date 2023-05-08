import java.util.*;

public class CachingResults {

    private static Map<String, Map> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(mostAndLeastFrequentChars("Hello Worlddddd!!!"));

        System.out.println();
        System.out.println(mostAndLeastFrequentChars("Hello Worlddddd!!!"));


    }

    private static Map<Character, Character> mostAndLeastFrequentChars(String string) {
        if (cache.containsKey(string)) {
            System.out.println("Get from cache");
            return cache.get(string);
        }

        Map<Character, Integer> characterFrequency = new HashMap<>();
        for (Character ch : string.toCharArray()) {
            characterFrequency.put(ch, characterFrequency.getOrDefault(ch, 0) + 1);
        }

        Map.Entry<Character, Integer> max = null;
        Map.Entry<Character, Integer> min = null;
        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {
            if (max == null || entry.getValue() > max.getValue())
                max = entry;
            if (min == null || entry.getValue() < min.getValue())
                min = entry;
        }

        Map<Character, Character> result = new LinkedHashMap<>(min.getKey(), max.getKey());

        cache.put(string, result);
        return result;
    }
}