package PW;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatchingResults {
    public static void main(String[] args) {
        String str =  String.join(" ", args);
        System.out.println(str);
        var map = getCharOccurances(str);
        System.out.println(mostAndLeastFrequent(map, "least"));
        System.out.println(mostAndLeastFrequent(map, "most"));
    }

    static public List<Character> mostAndLeastFrequent(Map<Character, Integer> map, String type){
        int lowest = 100, highest = 0;
        List<Character> least = new ArrayList<>();
        List<Character> most = new ArrayList<>();
        for (Map.Entry<Character, Integer> ch: map.entrySet()){
            if (ch.getValue() > highest) highest = ch.getValue(); 
            if (ch.getValue() < lowest) lowest = ch.getValue(); 
        }
        for (Map.Entry<Character, Integer> ch: map.entrySet()){
            if (ch.getValue() == highest) most.add(ch.getKey());
            if (ch.getValue() == lowest) least.add(ch.getKey());
        }
        return type == "least" ? least : most;
    }

    static public Map<Character, Integer> getCharOccurances(String str){
        str = str.toLowerCase();
        Map<Character, Integer> dict = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') continue;
            AddToMap(dict, str.charAt(i));
        }
        return dict;
    }

    static private void AddToMap(final Map<Character, Integer> map,
    Character key){
        // key = Character.toLowerCase(key);
        if (!map.containsKey(key)){
            map.put(key, 1);
        } else map.compute(key, (k, v) -> v + 1);
    }
}
