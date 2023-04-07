package Week9;

import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        // Read the input string from command line argument
        String inputString = args[0];
        
        // Create a map to store character occurrences and their indexes
        Map<Character, List<Integer>> occurrences = new HashMap<>();
        
        // Iterate over the characters in the input string and update the map
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            occurrences.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        
       // Print the character occurrences in non-descending order
        System.out.println("Character occurrences (non-descending order):");
        for (Map.Entry<Character, List<Integer>> entry : occurrences.entrySet()) {
        Character c = entry.getKey();
        List<Integer> indexes = entry.getValue();
        System.out.println(c + ": " + indexes);
}

    // Print the character occurrences in non-ascending order
    System.out.println("Character occurrences (non-ascending order):");
    for (Map.Entry<Character, List<Integer>> entry : new TreeMap<>(Collections.reverseOrder()).entrySet()) {
    Character c = entry.getKey();
    List<Integer> indexes = entry.getValue();
    System.out.println(c + ": " + indexes);
}

    }
}
