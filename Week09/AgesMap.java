import java.util.*;

public class AgesMap {

    public static void main(String[] args) {
        // create a HashMap to store name-age pairs
        Map<String, Integer> agesHashMap = new HashMap<>();
        agesHashMap.put("Messi", 25);
        agesHashMap.put("Ronaldo", 30);
        agesHashMap.put("Pele", 20);

        // print out keys with associated values using enhanced for statement
        System.out.println("Printing HashMap using enhanced for statement:");
        for (String name : agesHashMap.keySet()) {
            System.out.println(name + " - " + agesHashMap.get(name));
        }

        // print out keys with associated values using iterator
        System.out.println("Printing HashMap using iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = agesHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // print out keys with associated values using toString() method
        System.out.println("Printing HashMap using toString() method:");
        System.out.println(agesHashMap.toString());

        // create a LinkedHashMap to store name-age pairs
        Map<String, Integer> agesLinkedHashMap = new LinkedHashMap<>();
        agesLinkedHashMap.put("Messi", 25);
        agesLinkedHashMap.put("Ronaldo", 30);
        agesLinkedHashMap.put("Pele", 20);

        // print out keys with associated values of LinkedHashMap
        System.out.println("Printing LinkedHashMap using toString() method:");
        System.out.println(agesLinkedHashMap.toString());

        // create a TreeMap to store name-age pairs in alphabetically non-ascending order
        Map<String, Integer> agesTreeMap = new TreeMap<>(Collections.reverseOrder());
        agesTreeMap.put("Messi", 25);
        agesTreeMap.put("Ronaldo", 30);
        agesTreeMap.put("Pele", 20);

        // print out keys with associated values of TreeMap
        System.out.println("Printing TreeMap using toString() method:");
        System.out.println(agesTreeMap.toString());

        // sort a HashMap entries based on the descending order of the ages (values)
        // create a list of entries from the HashMap
        List<Map.Entry<String, Integer>> list = new ArrayList<>(agesHashMap.entrySet());

        // sort the list using a comparator based on the ages (values)
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // create a new LinkedHashMap to store the sorted entries
        Map<String, Integer> sortedAgesHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedAgesHashMap.put(entry.getKey(), entry.getValue());
        }

        // print out keys with associated values of the sorted HashMap
        System.out.println("Printing sorted HashMap using toString() method:");
        System.out.println(sortedAgesHashMap.toString());
    }
}
