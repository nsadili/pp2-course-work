import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide a string as a command-line argument");
            return;
        }
        String input = args[0];
        Map<Character, TreeSet<Integer>> occurrences = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!occurrences.containsKey(c)) {
                occurrences.put(c, new TreeSet<>());
            }
            occurrences.get(c).add(i);
        }
        // Print characters and their indexes in non-descending order
        System.out.println("Characters and their indexes in non-descending order:");
        for (Map.Entry<Character, TreeSet<Integer>> entry : occurrences.entrySet()) {
            Character c = entry.getKey();
            TreeSet<Integer> indexes = entry.getValue();
            System.out.print(c + ": ");
            for (Integer index : indexes) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
         // Print characters and their indexes in non-ascending order
         System.out.println("Characters and their indexes in non-ascending order:");
         TreeSet<Character> reversedChars = new TreeSet<>(Collections.reverseOrder());
         reversedChars.addAll(occurrences.keySet());
         for (Character c : reversedChars) {
             TreeSet<Integer> indexes = occurrences.get(c);
             System.out.print(c + ": ");
             for (Integer index : indexes) {
                 System.out.print(index + " ");
             }
             System.out.println();
         }
     }
 }