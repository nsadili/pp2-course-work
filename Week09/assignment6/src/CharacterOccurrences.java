import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = args[0];
        TreeMap<Character, List<Integer>> charMap = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!charMap.containsKey(c)) {
                charMap.put(c, new ArrayList<>());
            }
            charMap.get(c).add(i);
        }

        System.out.println("Characters in alphabetically non-descending order:");
        for (char c : charMap.keySet()) {
            List<Integer> indices = charMap.get(c);
            System.out.print(c + ": ");
            for (int i : indices) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Characters in alphabetically non-ascending order:");
        NavigableSet<Character> reverseCharSet = charMap.descendingKeySet();
        for (char c : reverseCharSet) {
            List<Integer> indices = charMap.get(c);
            System.out.print(c + ": ");
            for (int i : indices) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
