package Week09;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        String input = args[0];

        Map<Character, List<Integer>> charMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!charMap.containsKey(c)) {
                charMap.put(c, new ArrayList<>());
            }
            charMap.get(c).add(i);
        }

        System.out.println("Alphabetically non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int index : entry.getValue()) {
                System.out.print(index + " ");
            }
            System.out.println();
        }

        System.out.println("Alphabetically non-ascending order:");
        List<Character> chars = new ArrayList<>(charMap.keySet());
        Collections.sort(chars, Collections.reverseOrder());
        for (char c : chars) {
            System.out.print(c + ": ");
            for (int index : charMap.get(c)) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}

