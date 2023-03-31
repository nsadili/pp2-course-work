package ex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
            
            
        });

        ages.put("Leyla", 18);
        ages.put("Elvin", 17);
        ages.put("Nuraddin", 30);
        ages.put("Laman", 18);
        ages.put("Laman", 20);
        // System.out.println(ages);
        // for (var key : ages.keySet()) {
        // System.out.println(key + ": " + ages.get(key));
        // Iterator i = ages.keySet().iterator();
        // while(i.hasNext()){
        // var key = i.next();
        // System.out.println(key+":"+ages.get(key));
        // }
        // }
        // Iterator it = ages.keySet().iterator();
        // for(;it.hasNext()){
        // var key = it.next();
        // System.out.println(key + ":"+ages.get(key));
        //
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        

    }
}
