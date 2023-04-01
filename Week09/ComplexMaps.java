package Week09;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ComplexMaps {

    public static void main(String[] args) {
        Map<String, List<String>> friendsMap = new HashMap<>();
        addAPairOfFriends(friendsMap, "Nuraddin", "Shamil");
        addAPairOfFriends(friendsMap, "Nuraddin", "Laman");
        addAPairOfFriends(friendsMap, "Nuraddin", "Vasila");
        System.out.println("Initial Friends Map: " + friendsMap);

        removePairOfFriends(friendsMap, "Nuraddin", "Laman");
        System.out.println("After Removing Nuraddin-Laman Pair: " + friendsMap);
    }

    static void addPairOfFriends(Map<String, List<String>> friendsMap, String f1, String f2) {
        addToMap(friendsMap, f1, f2);
        addToMap(friendsMap, f2, f1);
    }

    static void addAPairOfFriends(Map<String, List<String>> friendsMap, String f1, String f2) {
        addToMap(friendsMap, f1, f2);
        addToMap(friendsMap, f2, f1);
    }

    static void removePairOfFriends(Map<String, List<String>> friendsMap, String f1, String f2) {
        removeFromMap(friendsMap, f1, f2);
        removeFromMap(friendsMap, f2, f1);
    }

    static void addToMap(Map<String, List<String>> map, String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            var list = new ArrayList<String>();
            list.add(value);
            map.put(key, list);
        }
    }

    static void removeFromMap(Map<String, List<String>> map, String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).remove(value);
        }
    }
}
