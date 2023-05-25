package Week09.ex4;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> friendsMap = new HashMap<>();
        addFriend(friendsMap, "Zaur", "Emil");
        addFriend(friendsMap, "Jack", "Vasya");
        addFriend(friendsMap, "Vasya", "Valera");
        addFriend(friendsMap, "Emil", "Jack");
        addFriend(friendsMap, "Emil", "John");
        addFriend(friendsMap, "Zaur", "Emil");

        System.out.println(friendsMap);

        removeFriend(friendsMap, "Jack", "Emil");

        System.out.println(friendsMap);
    }

    public static void addFriend(Map<String, List<String>> map, String key, String val) {
        if (map.get(key) == null) {
            List<String> friends = new ArrayList<>();
            friends.add(val);
            map.put(key, friends);
            addFriend(map, val, key);
        } else if (!map.get(key).contains(val)) {
            map.get(key).add(val);
            addFriend(map, val, key);
        }
    }

    public static void removeFriend(Map<String, List<String>> map, String key, String val) {
        if (map.get(key) != null && map.get(key).contains(val)) {
            map.get(key).remove(val);
            removeFriend(map, val, key);
        }
    }
}
