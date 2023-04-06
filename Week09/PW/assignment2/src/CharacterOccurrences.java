import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {

    public static void main(String[] args) {

        String str = args[0];
        Map<Character, String> charMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String indexStr = charMap.getOrDefault(ch, "");
            indexStr += i;
            charMap.put(ch, indexStr);
        }

        System.out.println("Characters in non-descending order:");
        Map<Character, String> sortedCharMap = new TreeMap<>(charMap);
        for (Map.Entry<Character, String> entry : sortedCharMap.entrySet()) {
            char ch = entry.getKey();
            String indexStr = entry.getValue();
            System.out.println(ch + " - " + indexStr);
        }

        System.out.println("\nCharacters in non-ascending order:");
        Map<Character, String> reverseCharMap = new TreeMap<>(sortedCharMap).descendingMap();
        for (Map.Entry<Character, String> entry : reverseCharMap.entrySet()) {
            char ch = entry.getKey();
            String indexStr = entry.getValue();
            System.out.println(ch + " - " + indexStr);
        }
    }
}