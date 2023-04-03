package PW;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {
        String str =  String.join(" ", args);
        System.out.println(str);
        var res = getCharOccurances(str);
        for (var entry: res.entrySet()){
            System.out.printf("<%c>: %s\n", entry.getKey(), entry.getValue());
        }
    }

    static public Map<Character, List<Integer>> getCharOccurances(String str){
        str = str.toLowerCase();
        Map<Character, List<Integer>> dict = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
                // if we write return o2.compareTo(o1) it will give us reversed alphabetical order
            }
        });
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') continue;
            AddToMap(dict, str.charAt(i), i);
        }
        return dict;
    }

    static private void AddToMap(Map<Character, List<Integer>> map,
    Character key, Integer value){
        // key = Character.toLowerCase(key);
        if (!map.containsKey(key)){
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else map.get(key).add(value);
    }
}
