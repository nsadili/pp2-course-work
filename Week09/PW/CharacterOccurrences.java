package Week09.PW;

import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        
        String input = args[0];
        printCharacterOccurrences(input);
    }
    
    public static void printCharacterOccurrences(String input) {
        Map<Character, List<Integer>> occurrences = new TreeMap<>();
        
      
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            occurrences.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }
        
        
        System.out.println("Characters in alphabetically non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : occurrences.entrySet()) {
            char ch = entry.getKey();
            List<Integer> indexes = entry.getValue();
            System.out.print(ch + ": ");
            for (int index : indexes) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
        
    
        System.out.println("Characters in alphabetically non-ascending order:");
        List<Character> characters = new ArrayList<>(occurrences.keySet());
        Collections.reverse(characters);
        for (char ch : characters) {
            List<Integer> indexes = occurrences.get(ch);
            System.out.print(ch + ": ");
            for (int index : indexes) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
