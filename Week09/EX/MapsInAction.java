package EX;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class MapsInAction{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("islam", 17);
        map.put("Resad", 18);
        map.put("Elmar", 17);
        map.put("Baby", 9);

        //using for each loop
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        }

        System.out.println();
        //using iterator
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }

        //using toString method
        System.out.println();
        System.out.println(map.toString());


        //hashmap, linkedhashmap, treemap
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap(map);
        TreeMap<String, Integer> tmap = new TreeMap<>(map);
        System.out.println("HashMap: " + map.toString());
        System.out.println("LinkedHashMap: " + lmap.toString());
        System.out.println("TreeHashMap: " + tmap.toString());


        //treemap descending order
        var entry = tmap.entrySet();
        System.out.println(entry);
        
    }
}