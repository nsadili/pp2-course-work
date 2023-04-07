import java.util.TreeMap;
import java.util.Map;

public class TreeMapUse {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();

        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        for(String x : myMap.keySet()) {
            System.out.println(x + " =" + myMap.get(x));
        }
    }    
}
