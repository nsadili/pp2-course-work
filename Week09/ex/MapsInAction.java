import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class MapsInAction {
    public static void main(String[] args) {
        
        Map<String, Integer> ages = new LinkedHashMap<>();

        Map<String, Integer> ages1 = new TreeMap<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
               
            
        });

        ages.put("Shamil", 19);
        ages.put("LamanK", 17);
        ages.put("LamanA", 19);
        ages.put("Nuraddin", 16);

        System.out.println(ages);
        System.out.println();

        for(String key : ages.keySet()) {
            System.out.println(key + " " + ages.get(key));
        }

        System.out.println();

        Iterator<String> it = ages.keySet().iterator();

        while(it.hasNext()) {
            String key = it.next();
            System.out.println((key + ": " + ages.get(key)));
        }

        System.out.println();

        for(Entry<String, Integer> entry : ages.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
