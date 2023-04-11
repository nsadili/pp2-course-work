import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        System.out.println("a. Read a string as a command line argument.");
        String inputString = args[0];

        System.out.println("i. Print them in alphabetically non-descending order.");
        TreeMap<Character, List<Integer>> charMapAscending = new TreeMap<>();

        System.out.println("ii. Print them in alphabetically non-ascending order.");
        TreeMap<Character, List<Integer>> charMapDescending = new TreeMap<>(Collections.reverseOrder());


        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (charMapAscending.containsKey(c)) {
                List<Integer> indexList = charMapAscending.get(c);
                indexList.add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charMapAscending.put(c, indexList);
            }

            if (charMapDescending.containsKey(c)) {
                List<Integer> indexList = charMapDescending.get(c);
                indexList.add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                charMapDescending.put(c, indexList);
            }
        }

        System.out.println("Characters in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charMapAscending.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Characters in non-ascending order:");
        for (Map.Entry<Character, List<Integer>> entry : charMapDescending.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
