import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        // Read the string as a command line argument
        String inputString = args[0];

        // Create a TreeMap to store the character-index pairs
        Map<Character, String> charIndexMap = new TreeMap<>();

        // Populate the map with the character-index pairs
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            String indexString = charIndexMap.getOrDefault(c, "");
            indexString += i + " ";
            charIndexMap.put(c, indexString);
        }

        // Print the characters and their indexes in non-descending order
        System.out.println("Characters and their indexes in non-descending order:");
        for (char c : charIndexMap.keySet()) {
            System.out.println(c + ": " + charIndexMap.get(c));
        }

        // Print the characters and their indexes in non-ascending order
        System.out.println("Characters and their indexes in non-ascending order:");
        for (char c : ((TreeMap<Character, String>) charIndexMap).descendingKeySet()) {
            System.out.println(c + ": " + charIndexMap.get(c));
        }
    }
}
