package EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurance {
    public static void main(String[] args) {
        String str = args[0];
        int len = str.length();
        Map<Character, List<Integer>> charIndexMap = new TreeMap<>();

        // Build a map of characters and their indexes in the string
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (charIndexMap.containsKey(ch)) {
                charIndexMap.get(ch).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charIndexMap.put(ch, indexList);
            }
        }

        System.out.println("Characters and their indexes in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charIndexMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int index : entry.getValue()) {
                System.out.print(index + " ");
            }
            System.out.println();
        }

        System.out.println("Characters and their indexes in non-ascending order:");
        List<Character> charList = new ArrayList<>(charIndexMap.keySet());
        Collections.reverse(charList);
        for (char ch : charList) {
            System.out.print(ch + ": ");
            for (int index : charIndexMap.get(ch)) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}