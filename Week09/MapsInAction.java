import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapsInAction {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("Shamil", 19);
        ages.put("LemanK", 17);
        ages.put("LemanA", 19);
        ages.put("Nureddin", 16);
        ages.put("Rufet",8);
        ages.put("Nariman",28);


        // System.out.println(ages);

        // for(var key : ages.keySet()){

        // System.out.println(key + ": " + ages.get(key));
        // }

        // Iterator<String> it = ages.keySet().iterator();

        // while (it.hasNext()) {
        //     var key = it.next();
        //     System.out.println(key + ": " + ages.get(key));

        // }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());
            
        System.out.println(list);

     list.sort(new Comparator<Map.Entry<String, Integer>>() {

       

        @Override
        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
          return o2.getValue() - o1.getValue();
        }
        
     });

     System.out.println(list);

    }

}