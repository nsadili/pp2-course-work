package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {

        if (args.length == 0)
            System.out.println("Please, enter some string!");

        String str = String.join(" ", args);

        TreeMap<Character, List<Integer>> map = (TreeMap<Character, List<Integer>>) getCharOccurences(str);

        if (map == null)
            System.out.println("NULL");
        else {
            System.out.println("non-descending...");
            for (Character ch : map.keySet())
                System.out.println(ch + ": " + map.get(ch));

            System.out.println("non-ascending...");
            for (Character ch : map.descendingKeySet())
                System.out.println(ch + ": " + map.get(ch));
        }
    }

    static Map<Character, List<Integer>> getCharOccurences(String string) {
        if (string == null)
            return null;

        Map<Character, List<Integer>> map = new TreeMap<>();

        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, new ArrayList<>());

            map.get(ch).add(i);
        }

        return map;
    }
}
