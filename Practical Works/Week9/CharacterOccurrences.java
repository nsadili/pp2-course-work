package Week9;

import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = args[0];

        Map<Character, List<Integer>> occurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            List<Integer> indexes = occurrences.getOrDefault(ch, new ArrayList<>());
            indexes.add(i);
            occurrences.put(ch, indexes);
        }

        System.out.println("Characters and indexes (non-descending order):");
        for (Map.Entry<Character, List<Integer>> entry : occurrences.entrySet()) {
            char ch = entry.getKey();
            List<Integer> indexes = entry.getValue();
            System.out.println(ch + " - Indexes: " + indexes);
        }

        System.out.println("Characters and indexes (non-ascending order):");
        List<Character> reversedKeys = new ArrayList<>(occurrences.keySet());
        Collections.reverse(reversedKeys);
        for (char ch : reversedKeys) {
            List<Integer> indexes = occurrences.get(ch);
            System.out.println(ch + " - Indexes: " + indexes);
        }
    }
}
