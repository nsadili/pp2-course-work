package Week9;

import java.util.*;

public class MapsInAction {
    public static void main(String[] args) {
        // Creating a HashMap to store name and age pairs
        Map<String, Integer> ages = new HashMap<>();
        
        // Adding name and age pairs to the map
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        
        // Printing out the keys with associated values using an enhanced for statement
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + " is " + age + " years old.");
        }
        
        // Printing out the keys with associated values using an iterator
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old.");
        }
        
        // Printing out the keys with associated values using toString() method
        System.out.println(ages.toString());
        
        // Trying different implementations of the map
        Map<String, Integer> hashMap = new HashMap<>(ages);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        Map<String, Integer> treeMap = new TreeMap<>(ages);
        
        // Printing out the entries of the different map implementations
        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);
        
        // Changing the order of entries in the TreeMap to non-ascending order
        Comparator<String> nonAscendingOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };
        Map<String, Integer> treeMapNonAscending = new TreeMap<>(nonAscendingOrder);
        treeMapNonAscending.putAll(ages);
        System.out.println("TreeMap with non-ascending order: " + treeMapNonAscending);
    }
}
