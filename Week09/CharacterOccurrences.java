import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterOccurrences {
    public static void main(String[] args) {
        // Read the string as a command line argument
        if (args.length < 1) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        String inputString = args[0];

        // Create a map to store character occurrences and their indexes
        Map<Character, List<Integer>> characterOccurrences = new HashMap<>();

        // Iterate over the string to populate the map
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            List<Integer> indexes = characterOccurrences.getOrDefault(c, new ArrayList<>());
            indexes.add(i);
            characterOccurrences.put(c, indexes);
        }

        // Sort the characters in non-descending order
        List<Character> charactersAscending = new ArrayList<>(characterOccurrences.keySet());
        Collections.sort(charactersAscending);

        // Print the characters and their indexes in non-descending order
        System.out.println("Characters in non-descending order:");
        for (char c : charactersAscending) {
            List<Integer> indexes = characterOccurrences.get(c);
            System.out.println("Character: " + c + ", Indexes: " + indexes);
        }

        // Sort the characters in non-ascending order
        List<Character> charactersDescending = new ArrayList<>(characterOccurrences.keySet());
        Collections.sort(charactersDescending, Collections.reverseOrder());

        // Print the characters and their indexes in non-ascending order
        System.out.println("Characters in non-ascending order:");
        for (char c : charactersDescending) {
            List<Integer> indexes = characterOccurrences.get(c);
            System.out.println("Character: " + c + ", Indexes: " + indexes);
        }
    }
}
