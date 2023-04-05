import java.util.Map;

public class CharacterOccurancesTest {

    public static void main(String[] args) {
        String str = args[0];
        Map<Character, String> charMap = CharacterOccurrences.getCharMap(str, false);

        for (Map.Entry<Character, String> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        Map<Character, String> charMapReverse = CharacterOccurrences.getCharMap(str, true);
        for (Map.Entry<Character, String> entry : charMapReverse.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
