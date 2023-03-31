package Week09;

import java.util.HashMap;
import java.util.Iterator;

public class MapsInAction {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Naik Pashayev", 18);
        ages.put("Vidadi Nabiyev", 17);
        ages.put("Elchin Pashayev", 45);

        System.out.println(ages);
        System.out.println("");

        // for(var key: ages.keySet()){
        //     System.out.println(key + " -> " + ages.get(key));
        // }

        Iterator<String> itr = ages.keySet().iterator();
        while(itr.hasNext()){
            var key = itr.next();
            System.out.println(key + " -> " + ages.get(key));
        }
    }
}
