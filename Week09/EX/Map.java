import java.util.*;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        System.out.println("a. Create a Map<String, Integer> ages and add some name and age pairs to it.");
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        ages.put("David", 40);


        System.out.println("i. Print out the keys with associated values using");
        System.out.println("1. Enhanced for statement");
        for (HashMap.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        System.out.println("2. Iterator");
        Iterator<HashMap.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        System.out.println("3. toString() method");
        System.out.println("\nUsing toString() method:");
        System.out.println(ages.toString());

        System.out.println("ii. Try HashMap, LinkedHashMap and TreeMap implementations of the map and check the output.");
        HashMap<String, Integer> hashMap = new HashMap<>(ages);
        HashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        HashMap<String, Integer> treeMap = new HashMap<>(ages);

        System.out.println("\nUsing HashMap:");
        System.out.println(hashMap);

        System.out.println("\nUsing LinkedHashMap:");
        System.out.println(linkedHashMap);

        System.out.println("\nUsing TreeMap:");
        System.out.println(treeMap);

        System.out.println("iii. In case of a TreeMap implementation, the entries are ordered based on the natural ordering of the keys (which is ordering of Strings).\n" +
                "1. Add necessary changes to store the entries in the TreeMap in an alphabetically non-ascending order.");
        Comparator<String> reverseOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };


    }
}
