import java.util.*;

public class CharacterOccurrences {

    public static void main(String[] args) {
        String str = args[0];
        
        TreeMap<Character, List<Integer>> charOccurrences = new TreeMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!charOccurrences.containsKey(ch)) {
                charOccurrences.put(ch, new ArrayList<Integer>());
            }
            charOccurrences.get(ch).add(i);
        }
        
        System.out.println("Characters in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charOccurrences.entrySet()) {
            char ch = entry.getKey();
            List<Integer> occurrences = entry.getValue();
            System.out.print(ch + ": " + occurrences + " ");
        }

        System.out.println("\nCharacters in non-ascending order:");
        for (Map.Entry<Character, List<Integer>> entry : charOccurrences.descendingMap().entrySet()) {
            char ch = entry.getKey();
            List<Integer> occurrences = entry.getValue();
            System.out.print(ch + ": " + occurrences + " ");
        }
    }
}
