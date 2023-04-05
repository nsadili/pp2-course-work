import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class CharacterOccurrences {

    public static Map<Character, String> getCharMap(String str, boolean reverse) {
        Comparator<Character> comparator = reverse ? Comparator.reverseOrder() : Comparator.naturalOrder();
        Map<Character, String> charMap = new TreeMap<>(comparator);
                for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charMap.containsKey(ch)) {
                String indexList = charMap.get(ch);
                indexList += ", " + i;
                charMap.put(ch, indexList);
            } else {
                charMap.put(ch, Integer.toString(i));
            }
        }
        return charMap;
    }
}
