import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {

        String str = args[0];
        // create a map
        Map<Character, List<Integer>> map = new TreeMap<Character, List<Integer>>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.get(c).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(c, list);
            }
        }

        System.out.println("Map: ");
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

