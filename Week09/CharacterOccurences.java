import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {

        String str = args[0].toLowerCase();

        // Map<Character, List<Integer>> charOccurence = new TreeMap<>(); non-decending

        Map<Character, List<Integer>> charOccurence = new TreeMap<>(new Comparator<Character>() {
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);
            if (!(charOccurence.containsKey(ch))) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                charOccurence.put(ch, list);
            } else
                charOccurence.get(ch).add(i);
        }

        for (var key : charOccurence.keySet())
            System.out.println(key + ": " + charOccurence.get(key));

        System.out.println("end");
    }
}