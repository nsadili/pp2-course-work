import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        
        // Adding some name and age pairs to the map
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 20);
        ages.put("David", 35);
        ages.put("Eva", 28);

        // Print out the keys with associated values using an enhanced for statement
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + ": " + age);
        }

        // Print out the keys with associated values using an iterator
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }

        // Print out the keys with associated values using the toString() method
        System.out.println(ages.toString());
    }
}
