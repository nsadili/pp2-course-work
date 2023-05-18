import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No string provided as a command line argument.");
            return;
        }

        String input = args[0];
        Map<Character, String> charactersMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String indexes = charactersMap.getOrDefault(c, "");
            indexes += i + " ";
            charactersMap.put(c, indexes);
        }

        System.out.println("Characters and their indexes in non-descending order:");

        for (Map.Entry<Character, String> entry : charactersMap.entrySet()) {
            char c = entry.getKey();
            String indexes = entry.getValue();
            System.out.println("Character: " + c + ", Indexes: " + indexes.trim());
        }

        System.out.println();

        System.out.println("Characters and their indexes in non-ascending order:");

        for (Map.Entry<Character, String> entry : ((TreeMap<Character, String>) charactersMap).descendingMap().entrySet()) {
            char c = entry.getKey();
            String indexes = entry.getValue();
            System.out.println("Character: " + c + ", Indexes: " + indexes.trim());
        }
    }
}
