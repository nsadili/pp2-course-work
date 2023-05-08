
package Week09;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ex7 {

    private static Map<String, Map> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(mostAndLeastFrequentChars("Hello Worlddddd"));

        System.out.println();
        System.out.println(mostAndLeastFrequentChars("Hello Worlddddd"));


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

        Map.Entry<Character, Integer> maximum = null;
        Map.Entry<Character, Integer> minimum = null;
        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {
            if (maximum == null || entry.getValue() > maximum.getValue())
                maximum = entry;
            if (minimum == null || entry.getValue() < minimum.getValue())
                minimum = entry;
        }

        Map<Character, Character> result = new LinkedHashMap<>(minimum.getKey(), maximum.getKey());

        cache.put(string, result);
        return result;
    }
}