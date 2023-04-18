package Week09;
import java.util.*;

public class CachingResults {
    private static Cache<String, Map<Character, Character>> cache = new Cache<>();

    public static void main(String[] args) {
        System.out.println(mostAndLeastFrequentCharacters("Hmmmm"));

        System.out.println();
        System.out.println(mostAndLeastFrequentCharacters("Hmmmmmmm"));
    }

    private static Map<Character, Character> mostAndLeastFrequentCharacters(String string) {
        Map<Character, Character> result = cache.get(string);
        if (result != null) {
            System.out.println("Get from cache");
            return result;
        }

        Map<Character, Integer> characterFreq = computeCharacterFrequency(string);

        Map.Entry<Character, Integer> max = null;
        Map.Entry<Character, Integer> min = null;
        for (Map.Entry<Character, Integer> entry : characterFreq.entrySet()) {
            if (max == null || entry.getValue() > max.getValue())
                max = entry;
            if (min == null || entry.getValue() < min.getValue())
                min = entry;
        }

        result = new LinkedHashMap<>();
        result.put(min.getKey(), max.getKey());

        cache.put(string, result);
        return result;
    }

    private static Map<Character, Integer> computeCharacterFrequency(String string) {
        Map<Character, Integer> characterFreq = new HashMap<>();
        for (Character ch : string.toCharArray()) {
            characterFreq.put(ch, characterFreq.getOrDefault(ch, 0) + 1);
        }
        return characterFreq;
    }

    private static class Cache<K, V> {
        private Map<K, V> map = new HashMap<>();

        public synchronized V get(K key) {
            return map.get(key);
        }

        public synchronized void put(K key, V value) {
            map.put(key, value);
        }
    }
}
