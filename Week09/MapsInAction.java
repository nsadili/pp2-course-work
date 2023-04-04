package Week09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsInAction {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("Nijat", 19);
        ages.put("Bahadur", 17);
        ages.put("BahadurS", 19);
        ages.put("Nureddin", 16);
        ages.put("Telman",8);
        ages.put("Elcin",28);

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