import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
            }
            map.get(c).add(i);
        }

        System.out.println("Characters and indexes in non-descending order:");
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Characters and indexes in non-ascending order:");
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.reverse(keys);
        for (char c : keys) {
            System.out.print(c + ": ");
            for (int i : map.get(c)) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}