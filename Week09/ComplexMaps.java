package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {

    static void addPairOfFriends(Map<String, List<String>> friends, String s1, String s2) {
        if(friends.containsKey(s1))
            friends.get(s1).add(s2);
        else {
            List<String>  list = new ArrayList<>();
            list.add(s2);
            friends.put(s1, list);
        }
    }

    static boolean removeAFriend(Map<String, List<String>> friends, String s1, String s2) {
        if(!friends.containsKey(s1)) return false;
        if(!friends.get(s1).contains(s2)) return false;
        friends.get(s1).remove(s2);
        return true;
    }

    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();

        addPairOfFriends(friends, "Ulkar", "Aydan");
        addPairOfFriends(friends, "Ulkar2", "Aydan2");
        addPairOfFriends(friends, "Ulkar3", "Aydan3");

        for(String name: friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));
        }

        System.out.println(removeAFriend(friends, "Ulkar", "Aydan"));
        System.out.println(removeAFriend(friends, "Nuray", "Aydan"));
        System.out.println(removeAFriend(friends, "Ulkar", "Nuray"));

    }
}