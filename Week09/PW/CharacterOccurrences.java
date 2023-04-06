import java.util.*;

public class CharacterOccurrences {
    private static Map<Character, List<Integer>> buildCharacterMap(String input) {
        Map<Character, List<Integer>> characterMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            characterMap.putIfAbsent(c, new ArrayList<>());
            characterMap.get(c).add(i);
        }

        return characterMap;
    }

    private static void printCharacterMap(Map<Character, List<Integer>> characterMap) {
        for (Map.Entry<Character, List<Integer>> entry : characterMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Indexes: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide a string as a command line argument.");
            return;
        }

        String input = args[0];
        Map<Character, List<Integer>> characterMap = buildCharacterMap(input);

        System.out.println("Characters and indexes in non-descending order:");
        printCharacterMap(characterMap);

        System.out.println("Characters and indexes in non-ascending order:");
        Map<Character, List<Integer>> reversedCharacterMap = new TreeMap<>(Collections.reverseOrder());
        reversedCharacterMap.putAll(characterMap);
        printCharacterMap(reversedCharacterMap);
    }
}
