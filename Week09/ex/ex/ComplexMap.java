package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();
        addFriendsPair(friends, "Rahima", "Vasila");
        addFriendsPair(friends, "Vasila", "Laman");
        addFriendsPair(friends, "Laman", "Rahima");
        for(String friend:friends.keySet()){
            System.out.println(friend+":"+friends.get(friend));
        }
        removeFromMap(friends, "Rahima", "Vasila");
        for(String friend:friends.keySet()){
            System.out.println(friend+":"+friends.get(friend));
        }
    }

    static void addFriendsPair(Map<String, List<String>> friends, String friend1, String friend2) {

        addToMap(friends, friend1, friend2);
        addToMap(friends, friend2, friend1);

    }

    static void addToMap(Map<String, List<String>> Map, String Key, String Value) {
        if (Map.containsKey(Key)) {
            Map.get(Key).add(Value);
        } else {
            var list = new ArrayList<String>();
            list.add(Value);
            Map.put(Key, list);
        }
    }

    static void removeFromMap(Map<String, List<String>> friends, String friend1, String friend2) {
        friends.get(friend2).remove(friend1);
        friends.get(friend1).remove(friend2);
    }
}
