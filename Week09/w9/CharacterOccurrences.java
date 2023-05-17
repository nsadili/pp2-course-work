import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String inputString = args[0];
        Map<Character, String> charIndexMap = new TreeMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            String indexString = charIndexMap.getOrDefault(c, "");
            indexString += i + " ";
            charIndexMap.put(c, indexString);
        }

        System.out.println("Characters and indexes are not in descending order:");
        for (char c : charIndexMap.keySet()) {
            System.out.println(c + ": " + charIndexMap.get(c));
        }

        System.out.println("Characters and indexes are not in descending orde:");
        for (char c : ((TreeMap<Character, String>) charIndexMap).descendingKeySet()) {
            System.out.println(c + ": " + charIndexMap.get(c));
        }
    }
}
