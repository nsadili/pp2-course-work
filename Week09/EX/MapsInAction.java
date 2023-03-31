package EX;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class MapsInAction {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("islam", 17);
        map.put("Resad", 18);
        map.put("Elmar", 17);
        map.put("Baby", 9);

        // using for each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        System.out.println();
        // using iterator
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        // using toString method
        System.out.println();
        System.out.println(map.toString());

        // hashmap, linkedhashmap, treemap
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap(map);
        TreeMap<String, Integer> tmap = new TreeMap<>(map);
        System.out.println("HashMap: " + map.toString());
        System.out.println("LinkedHashMap: " + lmap.toString());
        System.out.println("TreeHashMap: " + tmap.toString());

        // treemap descending order
        var entrySet = map.entrySet();
        // ArrayList<Integer> ages = new ArrayList<>();
        // for (Map.Entry<String, Integer> entry : entrySet) {
        //     ages.add(entry.getValue());
        // }

        List<Map.Entry<String, Integer>> listSet = new ArrayList<>(entrySet);
        Collections.sort(listSet, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        Map<String, Integer> sMap = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : listSet) {
            sMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sMap);
        
    }
}