import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ComplexMaps {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new TreeMap<>();

        addFriend(friends, "Jala", "Ulkar");
        addFriend(friends, "Jala", "Gunel");
        addFriend(friends, "Aytac", "Ayan");
        addFriend(friends, "Aytac", "Ulkar");
        addFriend(friends, "Ulkar", "Ayan");
        
        for(var entry : friends.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(friends);
    }

    static void addFriend(Map<String, List<String>> friends,
            String friend1, String friend2) {

        addToMap(friends, friend1, friend2);
        addToMap(friends, friend2, friend1);
    }

    static void addToMap(Map<String, List<String>> map,
            String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
