
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = args[0];
        Map<Character, List<Integer>> charMap = new TreeMap<>(); // non-descending order

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charMap.containsKey(ch)) {
                charMap.get(ch).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charMap.put(ch, indexList);
            }
        }

        System.out.println("Characters and their indexes in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Character, List<Integer>> charMapDescending = new TreeMap<>(Collections.reverseOrder()); // decreasing order
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charMapDescending.containsKey(ch)) {
                charMapDescending.get(ch).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charMapDescending.put(ch, indexList);
            }
        }

        System.out.println("\nCharacters and their indexes in non-ascending order:");
        for (Map.Entry<Character, List<Integer>> entry : charMapDescending.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}