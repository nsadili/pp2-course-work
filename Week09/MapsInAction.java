import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.util.Map;

public class MapsInAction{
    public static void main(String[] args) {
        Map<String, Integer> ages= new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return o2.compareTo(o1);
            }
        });
        ages.put("Shamil",19);
        ages.put("Laman",17);
        ages.put("Laman",19);
        ages.put("Nuraddin",16);
        
        //System.out.println(ages);
        /*for(var key: ages.keySet()){
            System.out.println(key+": "+ages.get(key));
        }*/

        /*Iterator it= ages.keySet().iterator();
        while(it.hasNext()){
            var key= it.next();
            System.out.println(key+": "+ages.get(key));
        }*/

        for(java.util.Map.Entry entry:ages.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }
}