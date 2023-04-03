package Week09.classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();
        addFriendsPair(friends, "Nurradin", "Leyla");
        addFriendsPair(friends, "Nurradin", "Nihat");
        addFriendsPair(friends, "Ali", "Leyla");
        addFriendsPair(friends, "Nihat", "Leyla");
        
        for (var entry : friends.entrySet() ) {
            System.out.println(entry.getKey());
        }
    }

    static void addFriendsPair(Map<String, List<String>> friends, String friend1, String friend2){
        if (!friends.containsKey(friend1)) {
            List<String> list = new ArrayList<>();
            list.add(friend2);
            friends.put(friend1, list);
        }else{
        friends.get(friend1).add(friend2);
        }
    }

    static void addToMap(Map<String, List<String>> map, String key, String value){
        if (!map.containsKey(value)) {
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
            return;
        }
        map.get(key).add(value);
    }
}
