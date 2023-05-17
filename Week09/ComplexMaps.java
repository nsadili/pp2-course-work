package Week09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new TreeMap<>();

        addAPairOffFriends(friends, "Nuraddin", "Shamil");
        addAPairOffFriends(friends, "Nuraddin", "Laman");
        addAPairOffFriends(friends, "Laman", "Vasila");

        System.out.println(removeAPairOffFriends(friends, "Nuraddin", "Shamil"));
        System.out.println(removeAPairOffFriends(friends, "Mahammad", "Shamil"));
        System.out.println(removeAPairOffFriends(friends, "Vasila", "Shamil"));

        for (String name : friends.keySet())
            System.out.println(name + ":" + friends.get(name));

    }

    static void addAPairOffFriends(Map<String, List<String>> friends, String f1, String f2) {
        addToMap(friends, f1, f2);
        addToMap(friends, f2, f1);

    }

    static void addToMap(Map<String, List<String>> map, String key, String value) {
        if (map.containsKey(key))
            map.get(key).add(value);
        else {
            var list = new ArrayList<String>();
            list.add(value);
            map.put(key, list);
        }
    }

    static boolean removeAPairOffFriends(Map<String, List<String>> friends, String f1, String f2) {
        if (!friends.containsKey(f1))
            return false;

        if (!friends.get(f1).contains(f2))
            return false;

        friends.get(f1).remove(f2);
        friends.get(f2).remove(f1);

        return true;
    }

    
    static boolean removeFromMap(Map<String, List<String>> map, String f1, String f2) {
        if (!map.containsKey(f1))
            return false;

        if (!map.get(f1).contains(f2))
            return false;

        map.get(f1).remove(f2);
        map.get(f2).remove(f1);

        return true;
    }
}
