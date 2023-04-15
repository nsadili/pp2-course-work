package Week09;

import java.util.*;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String inputString = args[0];

        for (int i = 0; i < inputString.length(); i++) {
            System.out.println("Character: " + inputString.charAt(i) + ", index: " + i);
        }

        Map<Character, Integer> ascendingOrderChar = new TreeMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            ascendingOrderChar.put(inputString.charAt(i), i);
        }

        System.out.println("Characters of the given string in ascending order and their indexes:");
        for (char character: ascendingOrderChar.keySet()) {
            System.out.println(character + " at index " + inputString.indexOf(character));
        }

        Map<Character, Integer> descendingOrderChar = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < inputString.length(); i++) {
            descendingOrderChar.put(inputString.charAt(i), i);
        }
        System.out.println("Characters of the given string in descending order and their indexes:");
        for (char character: descendingOrderChar.keySet()) {
            System.out.println(character + " at index " + inputString.indexOf(character));
        }
    }
}
