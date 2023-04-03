package Week09.pw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CharacterOccurences {

    public static void main(String[] args) {
        String str = String.join(" ", args);
        System.out.println(str);

        Map<Character, List<Integer>> occurrences = getCharOccurrences(str);
        System.out.println("Asending order:");
        printOccurrences(occurrences, false);
        System.out.println("\nDesending order:");
        printOccurrences(occurrences, true);
    }

    public static Map<Character, List<Integer>> getCharOccurrences(String str) {
        Map<Character, List<Integer>> occurrences = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            addToMap(occurrences, str.charAt(i), i);
        }
        return occurrences;
    }

    private static void addToMap(Map<Character, List<Integer>> map, Character key, Integer value) {
        if (!map.containsKey(key)) {
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else {
            map.get(key).add(value);
        }
    }

    public static void printOccurrences(Map<Character, List<Integer>> occurrences, boolean descending) {
        List<Character> keys = new ArrayList<>(occurrences.keySet());
        if (descending) {
            Collections.reverse(keys);
        } else {
            Collections.sort(keys);
        }
        for (Character key : keys) {
            System.out.print(key + ": ");
            List<Integer> indices = occurrences.get(key);
            for (int i = 0; i < indices.size(); i++) {
                System.out.print(indices.get(i));
                if (i < indices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
