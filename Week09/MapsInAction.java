package Week09;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;
public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>();
        ages.put("Shamil", 19);
        ages.put("Laman",17);
        ages.put("LamanA", 19);
        ages.put("Nuraddin", 16);
        System.out.println(ages);
        // for (var key : ages.keySet()){
        //     System.out.println(key + ":"+ ages.get(key));

        // }
        // Iterator<String> it = ages.keySet().iterator();
        // while(it.hasNext()){
        //     var key= it.next();
        //     System.out.println(it.hasNext()+":"+ages.get(it.next()));
        // }
        for (Entry<String, Integer>entry : ages.entrySet()){
            System.out.println();

        }

    }
}
