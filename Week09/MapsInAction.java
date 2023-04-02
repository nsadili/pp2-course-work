package week09;

import java.util.*;

public class MapsInAction {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Ulkar", 18);
        ages.put("Nijat", 33);
        ages.put("Tural", 34);
        ages.put("Rovshan", 27);

        System.out.println("Using an enhanced for statement:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nUsing an iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nUsing toString() method:");
        System.out.println(ages);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ulkar", 18);
        linkedHashMap.put("Nijat", 33);
        linkedHashMap.put("Tural", 34);
        linkedHashMap.put("Rovshan", 27);
        System.out.println("\nLinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Ulkar", 18);
        treeMap.put("Nijat", 33);
        treeMap.put("Tural", 34);
        treeMap.put("Rovshan", 27);
        System.out.println("\nTreeMap: " + treeMap);

        Map<String, Integer> descendingTreeMap = new TreeMap<>(Collections.reverseOrder());
        descendingTreeMap.putAll(treeMap);
        System.out.println("\nTreeMap with entries in an alphabetically non-ascending order: " + descendingTreeMap);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> descendingHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            descendingHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("\nHashMap with entries in descending order of ages: " + descendingHashMap);
    }
}
