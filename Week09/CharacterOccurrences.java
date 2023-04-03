import java.util.*;

public class CharacterOccurrences {
    private static Map<Character, List<Integer>> chars;

    public static void main(String[] args) {
        String str = String.join(" ", args);
        chars = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            addElement(str.charAt(i), i);
        }
        for (var entry : chars.entrySet()) {
            System.out.printf("'%c' -> %s\n", entry.getKey(), entry.getValue());
        }
    }

    private static void addElement(Character c, Integer i) {
        if (chars.containsKey(c)) chars.get(c).add(i);
        else {
            List<Integer> res = new ArrayList<>();
            res.add(i);
            chars.put(c, res);
        }
    }
}