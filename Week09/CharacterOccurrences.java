package Week09;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class CharacterOccurrences {
    public static void main(String[] args) {
        String commandLineArgument = args[0];

        Map<Character, String> characterMap = new HashMap<>();
        for (int i = 0; i < commandLineArgument.length(); i++) {
            char currentChar = commandLineArgument.charAt(i);
            if (characterMap.containsKey(currentChar)) {
                String currentVal = characterMap.get(currentChar);
                currentVal += ", " + i;
                characterMap.put(currentChar, currentVal);
            } else {
                characterMap.put(currentChar, Integer.toString(i));
            }
        }


        Map<Character, String> sortedCharMap = new TreeMap<>(characterMap);
        for (Map.Entry<Character, String> entry : sortedCharMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        Map<Character, String> reverseCharMap = new TreeMap<>(sortedCharMap).descendingMap();
        for (Map.Entry<Character, String> entry : reverseCharMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}