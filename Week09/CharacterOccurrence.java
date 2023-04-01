package Week09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrence {
    public static void main(String[] args) {
    
        if (args.length < 1) {
            System.out.println("Error: Please provide a string as command line argument.");
            return;
        }
        String str = args[0];
        char[] chars = str.toCharArray();
    
        TreeMap<Character, List<Integer>> indexMap = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            List<Integer> indexes = indexMap.getOrDefault(c, new ArrayList<>());
            indexes.add(i);
            indexMap.put(c, indexes);
        }

        System.out.println("Characters and their indexes in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : indexMap.entrySet()) {
            char c = entry.getKey();
            List<Integer> indexes = entry.getValue();
            System.out.print(c + ": ");
            for (int i : indexes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Characters and their indexes in non-ascending order:");
        for (Map.Entry<Character, List<Integer>> entry : indexMap.descendingMap().entrySet()) {
            char c = entry.getKey();
            List<Integer> indexes = entry.getValue();
            System.out.print(c + ": ");
            for (int i : indexes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
