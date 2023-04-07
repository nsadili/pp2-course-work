package EX;

import java.util.*;

public class MapEx{
    public static void main(String[] args) {


        Map<String, Integer> ages = new HashMap<>();        
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        ages.put("Dave", 40);
        ages.put("Emily", 20);
        
        System.out.println("Printing using enhanced for statement:");
        for (String name : ages.keySet()) {
            System.out.println(name + " - " + ages.get(name));
        }
        
        System.out.println("\nPrinting using iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("\nPrinting using toString() method:");
        System.out.println(ages.toString());        
        System.out.println("\nPrinting using HashMap:");
        Map<String, Integer> hashMap = new HashMap<>(ages);
        System.out.println(hashMap.toString());
        System.out.println("\nPrinting using LinkedHashMap:");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        System.out.println(linkedHashMap.toString());
        System.out.println("\nPrinting using TreeMap:");
        Map<String, Integer> treeMap = new TreeMap<>(ages);
        System.out.println(treeMap.toString());
        System.out.println("\nPrinting TreeMap in alphabetically non-ascending order:");
        Map<String, Integer> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
        reverseTreeMap.putAll(ages);
        System.out.println(reverseTreeMap.toString());
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(ages.entrySet());
        Collections.sort(entries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("\nPrinting HashMap entries sorted based on descending order of values:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

