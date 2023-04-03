package Week09;
import java.util.*;
public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("please provide a string as a command line argument.");
            return;
        }
        String inputString = args[0];
        System.out.println("input String: " + inputString);
        Map<Character, List<Integer>> charIndexMap = new TreeMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charIndexMap.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        System.out.println("\nalphabetically non-descending order:");
        charIndexMap.forEach((c, indexes) -> {
            System.out.print(c + " : ");
            indexes.forEach(i -> System.out.print(i + " "));
            System.out.println();
        });
        System.out.println("\nalphabetically non-ascending order:");
        charIndexMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.print(entry.getKey() + " : ");
                    entry.getValue().forEach(i -> System.out.print(i + " "));
                    System.out.println();
                });
    }
}