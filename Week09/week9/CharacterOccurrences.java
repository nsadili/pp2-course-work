package pp2.week9;

import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = args[0];

        Map<Character, List<Integer>> charIndexes = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!charIndexes.containsKey(c)) {
                charIndexes.put(c, new ArrayList<Integer>());
            }
            charIndexes.get(c).add(i);
        }

        System.out.println("Characters in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charIndexes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Characters in non-ascending order:");
        List<Character> chars = new ArrayList<>(charIndexes.keySet());
        Collections.reverse(chars);
        for (char c : chars) {
            System.out.println(c + ": " + charIndexes.get(c));
        }
    }
}
