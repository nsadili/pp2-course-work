import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to store name and age pairs
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        ages.put("Dave", 40);

        // i. Print out the keys with associated values using Enhanced for statement
        System.out.println("Using Enhanced for statement:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // i. Print out the keys with associated values using Iterator
        System.out.println("Using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // i. Print out the keys with associated values using toString() method
        System.out.println("Using toString() method:");
        System.out.println(ages.toString());

        // ii. Try HashMap, LinkedHashMap, and TreeMap implementations of the map and check the output
        Map<String, Integer> hashMap = new HashMap<>(ages);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        Map<String, Integer> treeMap = new TreeMap<>(ages);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);

        // iii. In case of a TreeMap implementation, the entries are ordered based on the natural ordering of the keys (which is ordering of Strings).
        // 1. Add necessary changes to store the entries in the TreeMap in an alphabetically non-ascending order.
        Map<String, Integer> treeMapDescending = new TreeMap<>(Collections.reverseOrder());
        treeMapDescending.putAll(ages);
        System.out.println("TreeMap with keys in alphabetically non-ascending order: " + treeMapDescending);

        // iv. Sorting HashMap entries based on the descending order of the ages (values) is not directly possible
        // as HashMap does not maintain any order. However, we can sort the entries and store them in a LinkedHashMap
        // based on the descending order of the ages (values).
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(ages.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<String, Integer> hashMapDescending = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            hashMapDescending.put(entry.getKey(), entry.getValue());
        }
        System.out.println("HashMap with entries sorted by descending order of ages: " + hashMapDescending);
    }
}
