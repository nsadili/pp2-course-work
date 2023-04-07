import java.util.LinkedHashMap;

public class LinkedHashMapUse {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for(String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
