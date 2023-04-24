package Week09;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap<String, Integer> ages and add some name and age pairs to it
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Vidadi", 25);
        ages.put("Naik", 30);
        ages.put("Ismail", 35);
        ages.put("Husein", 40);
        ages.put("Daniz", 45);

        // Print out the keys with associated values using enhanced for statement
        System.out.println("Printing using enhanced for statement:");
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        // Print out the keys with associated values using iterator
        System.out.println("\nPrinting using iterator:");
        Iterator<String> iterator = ages.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            int age = ages.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        // Print out the keys with associated values using toString() method
        System.out.println("\nPrinting using toString() method:");
        System.out.println(ages.toString());

        // Try HashMap, LinkedHashMap and TreeMap implementations of the map and check the output
        Map<String, Integer> hashMap = new HashMap<>(ages);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        Map<String, Integer> treeMap = new TreeMap<>(ages);

        System.out.println("\nPrinting HashMap:");
        System.out.println(hashMap);

        System.out.println("\nPrinting LinkedHashMap:");
        System.out.println(linkedHashMap);

        System.out.println("\nPrinting TreeMap:");
        System.out.println(treeMap);

        Map<String, Integer> treeMapReverseOrder = new TreeMap<>(Collections.reverseOrder());
        treeMapReverseOrder.putAll(ages);

        System.out.println("\nPrinting TreeMap with reverse order of keys:");
        System.out.println(treeMapReverseOrder);
    }
}

