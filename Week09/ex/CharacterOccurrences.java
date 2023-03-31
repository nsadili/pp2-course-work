import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {


        String str = String.join(" ", args);
        System.out.println(str);
        var res = getCharOccurances(str);
        
        for(var entry : res.entrySet()){
            System.out.printf("<%c> : %s ", entry.getKey(), entry.getValue());
        }
    }

    static public Map<Character, List<Integer>> getCharOccurances(String str){
        Map<Character, List<Integer>> A = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=0; i<str.length();i++){
            addToMap(A, str.charAt(i), i);
        }
        return A;
    }

    static private void addToMap(Map<Character, List<Integer>> map, Character key, Integer value){
        
        key = Character.toLowerCase(key);
        if(!map.containsKey(key)){
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else{
            map.get(key).add(value);
        }
    }
}
