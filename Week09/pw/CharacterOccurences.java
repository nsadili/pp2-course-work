import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterOccurences {
   public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("Please provide a string!");
        return;
    }

    String str = args[0].toLowerCase();

    Map<Character, List<Integer>> characterOccurrences = new TreeMap<>(new Comparator<Character>(){

        @Override
        public int compare(Character o1, Character o2) {
            return o2.compareTo(o1);
        }

    });
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        List<Integer> index = characterOccurrences.get(ch);
        if (index == null) {
            index = new ArrayList<>();
            characterOccurrences.put(ch, index);
        }
        index.add(i);
    }
    for (Map.Entry<Character, List<Integer>> input : characterOccurrences.entrySet()) {
        Character key = input.getKey();
        List<Integer> value = input.getValue();
        System.out.println(key + " " + value);
    }
}
}


