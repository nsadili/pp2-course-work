import java.util.*;

public class CharacterOccurrencesExample {
    public static void main(String[] args) {
        // a. Read a string as a command line argument.
        String str = args[0];

        // b. Print the characters of the string as well as the indexes where in the string they are placed.
        Map<Character, List<Integer>> charOccurrences = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charOccurrences.putIfAbsent(ch, new ArrayList<>());
            charOccurrences.get(ch).add(i);
        }

        // i. Print them in alphabetically non-descending order.
        System.out.println("Characters in non-descending order:");
        charOccurrences.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.print(entry.getKey() + ": ");
                    System.out.println(entry.getValue());
                });

        // ii. Print them in alphabetically non-ascending order.
        System.out.println("Characters in non-ascending order:");
        charOccurrences.entrySet().stream()
                .sorted(Map.Entry.<Character, List<Integer>>comparingByKey().reversed())
                .forEach(entry -> {
                    System.out.print(entry.getKey() + ": ");
                    System.out.println(entry.getValue());
                });
    }
}
