package Week09.classwork;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>();
        ages.put("Leyla", 18);
        ages.put("Elvin", 17);
        ages.put("Nariman", 19);
        ages.put("Nurradin", 30);
        System.out.println(ages);
        Iterator<String> it = ages.keySet().iterator();
        while(it.hasNext()){
            var key = it.next();
            System.out.println(key + ": " + ages.get(key));
        }
        for(var entry : ages.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
