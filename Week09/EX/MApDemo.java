package Week09.EX;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
//import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class MApDemo {
   
    public static void main(String[] args) {
        Map<String,Integer> ages = new HashMap<>();
        ages.put("Leyla",  18);
        ages.put("Malak",  20);
        ages.put("Rustam",  24);
        ages.put("Bakhtiyar",  23);

        System.out.println(ages);

        //for(var key : ages.keySet())
        //System.out.println(key+ "->" + ages.get(key));

        //Iterator<String> it = ages.keySet().iterator();
        //while(it.hasNext()){
         //    var key =it.next();
          //  System.out.println(it.next() + "->" + ages.get(it.next()));
           
          //for (var entry : ages.entrySet()){
            //System.out.println(entry.getKey() + " ;" + entry.getValue());
            
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
    


