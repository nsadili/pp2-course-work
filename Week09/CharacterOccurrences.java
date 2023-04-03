import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, List<Integer>> charOccurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!charOccurrences.containsKey(c)) {
                charOccurrences.put(c, new ArrayList<>());
            }

            charOccurrences.get(c).add(i);
        }

        System.out.println("Non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : charOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nNon-ascending order:");
        List<Character> keys = new ArrayList<>(charOccurrences.keySet());
        Collections.reverse(keys);
        for (Character c : keys) {
            System.out.println(c + ": " + charOccurrences.get(c));
        }
    }
}
