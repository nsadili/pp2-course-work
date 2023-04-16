package Week09.ex06;

import java.util.*;

public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a string as a command line argument.");
            return;
        }

        String str = args[0];

        Map<Character, List<Integer>> occurrencesAscending = new TreeMap<>();
        Map<Character, List<Integer>> occurrencesDescending = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!occurrencesAscending.containsKey(c)) {
              occurrencesAscending.put(c, new ArrayList<>());
            }
            occurrencesAscending.get(c).add(i);

            if (!occurrencesDescending.containsKey(c)) {
              occurrencesDescending.put(c, new ArrayList<>());
            }
            occurrencesDescending.get(c).add(i);
        }

        System.out.println("Character occurrences in alphabetical order:");
        for (Map.Entry<Character, List<Integer>> entry : occurrencesAscending.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Character occurrences in reverse alphabetical order:");
        for (Map.Entry<Character, List<Integer>> entry : occurrencesDescending.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}   
