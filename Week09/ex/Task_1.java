package Week09.ex;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        
       AbstractMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Monday");
        hm.put(2, "Tuesday");
        hm.put(4, "Thursday");
        hm.put(6, "Saturday");
        hm.put(3, "Wednesday");
        hm.put(5, "Friday");
        hm.put(7, "Sunday");
        hm.put(5, "Null");

        System.out.println(hm);

        Set keys = hm.keySet();
        Iterator it = keys.iterator();

        while(it.hasNext()) {
            Object key = it.next();
            Object value = hm.get(key);

            System.out.println("Key element = " + key + " Value element = " + value);
        }
    }
}
