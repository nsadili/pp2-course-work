import java.util.*;
public class CharacterOccurrences {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        String input = args[0];

        TreeMap<Character, ArrayList<Integer>> charOccurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!charOccurrences.containsKey(ch)) {
                charOccurrences.put(ch, new ArrayList<>());
            }
            charOccurrences.get(ch).add(i);
        }

        // Print the characters and their indexes in non-descending order
        System.out.println("Characters and indexes in non-descending order:");
        for (Map.Entry<Character, ArrayList<Integer>> entry : charOccurrences.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            ArrayList<Integer> indexes = entry.getValue();
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i));
                if (i < indexes.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        // Print the characters and their indexes in non-ascending order
        System.out.println("Characters and indexes in non-ascending order:");
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
            System.out.println();
        }
    }

}