package pp2.week09;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences
{
    public static void main(String[] args)
    {
        if (1 > args.length)
        {
            System.out.println("No string provided in the command line argument!");
            return;
        }

        String string = args[0];
        char[] chars = string.toCharArray();
        TreeMap<Character, List<Integer>> mapofindexes = new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            List<Integer> indexes = mapofindexes.getOrDefault(c, new ArrayList<>());
            indexes.add(i);
            mapofindexes.put(c, indexes);
        }

        System.out.println("Non-descending order: ");
        for (Map.Entry<Character, List<Integer>> entry : mapofindexes.entrySet()) {

            char s = entry.getKey();
            List<Integer> indexes = entry.getValue();
            System.out.print(s + ": ");
            for (int i : indexes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Non-ascending order: ");
        for (Map.Entry<Character, List<Integer>> list : mapofindexes.descendingMap().entrySet()) {
            char s = list.getKey();
            List<Integer> indexes = list.getValue();
            System.out.print(s + ": ");
            for (int i : indexes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}