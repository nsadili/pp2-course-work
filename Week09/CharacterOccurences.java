import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterOccurences {
    public static void main(String[] args) {
        String str =  String.join(" ", args);
        System.out.println(str);
        var res = getCharOccurances(str);
        System.out.println(res);
    }

    static public Map<Character, List<Integer>> getCharOccurances(String str){
        Map<Character, List<Integer>> dict = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            AddToMap(dict, str.charAt(i), i);
        }
        return dict;
    }

    static private void AddToMap(Map<Character, List<Integer>> map,
    Character key, Integer value){
        if (!map.containsKey(key)){
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else map.get(key).add(value);
    }
}
