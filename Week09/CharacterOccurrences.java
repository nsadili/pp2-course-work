import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        // String str = args[0];
        String str = String.join(" ", args);

        // System.out.println(str);
        var res=getCharOcc(str);
        for (var entry : res.entrySet()){
            System.out.printf("<%c> : <%s>\n", entry.getKey(), entry.getValue());
        }
        // System.out.println(res);
    }

    static public Map<Character, List<Integer>> getCharOcc(String str){
        str = str.toLowerCase();
        Map<Character, List<Integer>> dict = new TreeMap<>();

        for (int i=0; i<str.length(); i++)
            addToMap(dict, str.charAt(i), i);

        return dict;
    }

    static private void addToMap(Map<Character, List<Integer>> map, Character key, Integer value){
        if (!map.containsKey(key)){
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
        else map.get(key).add(value);
    }
}
