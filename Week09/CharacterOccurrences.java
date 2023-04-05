package Week09;


import java.util.*;

public class CharacterOccurrences {
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        
        String input = args[0];
        
        // Create a map to store the character occurrences
        Map<Character, List<Integer>> charOccurrences = new TreeMap<>();
        

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!charOccurrences.containsKey(c)) {
                charOccurrences.put(c, new ArrayList<>());
            }
            charOccurrences.get(c).add(i);
        }
        
        // Print the character occurrences in non-descending order
        System.out.println("Character occurrences in non-descending order:");
        for (char c : charOccurrences.keySet()) {
            System.out.print(c + ": ");
            for (int index : charOccurrences.get(c)) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
        
        // Print the character occurrences in non-ascending order
        System.out.println("\nCharacter occurrences in non-ascending order:");
        List<Character> sortedChars = new ArrayList<>(charOccurrences.keySet());
        Collections.reverse(sortedChars);
        for (char c : sortedChars) {
            System.out.print(c + ": ");
            for (int index : charOccurrences.get(c)) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
