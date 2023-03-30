package Week09;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapsInaction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>();

        ages.put("Nuraddin", 16);
        ages.put("Nariman", 17);
        ages.put("Shamil", 19);
        ages.put("Arzum", 18);
        ages.put("Shamil", 22);
        ages.put("Nijat", 25);



        // for (var key : ages.keySet()){
        //     System.out.println(key+": "+ages.get(key));
        // }
        // System.out.println();

        // Iterator<String> it = ages.keySet().iterator();
        // while (it.hasNext()){
        //     var key = it.next();
        //     System.out.println(key+": "+ages.get(key));
        // }
        // System.out.println();

        for (Entry<String, Integer> entry: ages.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
