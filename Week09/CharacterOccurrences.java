package Week09;
import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String CLA = args[0];

        Map<Character, String> CharacterBox = new HashMap<>();


        for (int i = 0; i < CLA.length(); i++) {
            char currentChar = CLA.charAt(i);
            if (CharacterBox.containsKey(currentChar)) {
                String currentVal = CharacterBox.get(currentChar);
                currentVal += ", " + i;
                CharacterBox.put(currentChar, currentVal);
            } else {
                CharacterBox.put(currentChar, Integer.toString(i));
            }
        }


        Map<Character, String> sortedCharacterBox = new TreeMap<>(CharacterBox);
        for (Map.Entry<Character, String> entry : sortedCharacterBox.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        Map<Character, String> reverseCharacterBox = new TreeMap<>(sortedCharacterBox).descendingMap();
        for (Map.Entry<Character, String> entry : reverseCharacterBox.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
