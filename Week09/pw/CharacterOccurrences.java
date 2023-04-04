import java.util.*;
public class CharacterOccurrences {

    public static void main(String[] args) {

        String s = args[0];
        TreeMap<Character, ArrayList<Integer>> charOccurrences = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!charOccurrences.containsKey(ch)) {
                charOccurrences.put(ch, new ArrayList<>());
            }
            charOccurrences.get(ch).add(i);
        }

        // non-descending order
        System.out.println("Non-descending order:");
        for (Map.Entry<Character, ArrayList<Integer>> entry : charOccurrences.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            ArrayList<Integer> indexes = entry.getValue();
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i));
                if (i < indexes.size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        // non-ascending order
        System.out.println("Non-ascending order:");
        List<Map.Entry<Character, ArrayList<Integer>>> list = new ArrayList<>(charOccurrences.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry<Character, ArrayList<Integer>> o1, Map.Entry<Character, ArrayList<Integer>> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });

        for (Map.Entry<Character, ArrayList<Integer>> entry : list) {
            System.out.print(entry.getKey() + ": ");
            ArrayList<Integer> indexes = entry.getValue();
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i));
                if (i < indexes.size() - 1) {
                    System.out.print(", ");
                }
            }
        }


    }
    
}