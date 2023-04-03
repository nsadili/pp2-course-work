import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {
        String inputString = args[0];

       
        Map<Character, String> charOccurrences = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (!charOccurrences.containsKey(c)) {
                charOccurrences.put(c, Integer.toString(i));
            } else {
                String indexes = charOccurrences.get(c);
                indexes += ", " + Integer.toString(i);
                charOccurrences.put(c, indexes);
            }
        }

        
        System.out.println("Characters and their indexes in alphabetically non-descending order:");
        TreeMap<Character, String> sortedCharsAscending = new TreeMap<>(charOccurrences);
        for (Map.Entry<Character, String> entry : sortedCharsAscending.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

       
        System.out.println("Characters and their indexes in alphabetically non-ascending order:");
        NavigableMap<Character, String> sortedCharsDescending = new TreeMap<>(charOccurrences).descendingMap();
        for (Map.Entry<Character, String> entry : sortedCharsDescending.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
