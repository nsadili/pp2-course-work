package week09;

import java.util.*;

public class CachingResults {
    private static Map<String, Map.Entry<Character, Character>> cache = new HashMap<>();

    public static Map.Entry<Character, Character> getMostAndLeastFrequentCharacters(String str) {

        if (cache.containsKey(str)) {
            System.out.println("Result obtained from cache.");
            return cache.get(str);
        }

        Map<Character, Integer> frequentMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequentMap.put(ch, frequentMap.getOrDefault(ch, 0) + 1);
        }

        Character mostFrequentCharacter = null, leastFrequentCharacter = null;
        for (Map.Entry<Character, Integer> entry : frequentMap.entrySet()) {
            if (mostFrequentCharacter == null || entry.getValue() > frequentMap.get(mostFrequentCharacter)) {
                mostFrequentCharacter = entry.getKey();
            }
            if (leastFrequentCharacter == null || entry.getValue() < frequentMap.get(leastFrequentCharacter)) {
                leastFrequentCharacter = entry.getKey();
            }
        }

        Map.Entry<Character, Character> result = new AbstractMap.SimpleEntry<>(mostFrequentCharacter, leastFrequentCharacter);

        cache.put(str, result);

        return result;
    }

    public static void main(String[] args) {
        String str1 = "hi";
        String str2 = "bye";
        String str3 = "hi";

        System.out.println(getMostAndLeastFrequentCharacters(str1));
        System.out.println(getMostAndLeastFrequentCharacters(str2));
        System.out.println(getMostAndLeastFrequentCharacters(str3));
    }
}

