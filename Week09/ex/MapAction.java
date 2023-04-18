package Week09.ex;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapAction {
    public static void main(String[] args) {
        
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Ahmed", 20);
        ages.put("Jesika", 37);
        ages.put("Pedro", 14);
        ages.put("Murad", 10);

        System.out.println(ages);
        System.out.println();

        for(String key : ages.keySet()) {
            System.out.println(key + " " + ages.get(key));
        }

        System.out.println();
        Iterator<String> it = ages.keySet().iterator();

        while(it.hasNext()) {
            String key = it.next();
            System.out.println((key + ":  " + ages.get(key)));
        }

        System.out.println();
        for(Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue());
        }

    }
}
