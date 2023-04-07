import java.util.HashMap;
import java.util.Map;

public class HashMapUse {
    public static void main(String[] args) {
        // Create a new HashMap object
        Map<String, Integer> myMap = new HashMap<>();
        
        // Add some key-value pairs to the map
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Retrieve a value from the map using a key
        int value = myMap.get("banana");

        // Print the value
        System.out.println(value);
    }    
}
