package week09;

import java.util.*;

public class CharacterOccurrences {

    public static void main(String[] args) {

        String str = args[0];

        Map<Character, List<Integer>> charIndexMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            List<Integer> indexList = charIndexMap.get(ch);

            if (indexList == null) {
                indexList = new ArrayList<>();
                charIndexMap.put(ch, indexList);
            }

            indexList.add(i);
        }

        System.out.println("Characters and their indexes in alphabetically non-descending order:");
        TreeMap<Character, List<Integer>> ascendingMap = new TreeMap<>(charIndexMap);
        for (Map.Entry<Character, List<Integer>> entry : ascendingMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Characters and their indexes in alphabetically non-ascending order:");
        TreeMap<Character, List<Integer>> descendingMap = new TreeMap<>(Collections.reverseOrder());
        descendingMap.putAll(charIndexMap);
        for (Map.Entry<Character, List<Integer>> entry : descendingMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

