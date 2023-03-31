package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friendsMap = new HashMap<>();

        addFriend(friendsMap, "Naik", "Vidadi");
        addFriend(friendsMap, "Vidadi", "Naik");
        addFriend(friendsMap, "Naik", "Zakir");
        addFriend(friendsMap, "Vidadi", "Zakir");
        addFriend(friendsMap, "Zakir", "Vidadi");
        addFriend(friendsMap, "Zakir", "Naik");
        addFriend(friendsMap, "Naik", "Arzu");
        removeFriend(friendsMap, "Naik", "Arzu");
        removeFriend(friendsMap, "Vidadi", "Arzu");

        System.out.println(friendsMap);
    }

    static void addFriend(Map<String, List<String>> friendsMap, String friend1, String friend2){
        if(friendsMap.containsKey(friend1)) friendsMap.get(friend1).add(friend2);
        else {
            List<String> list = new ArrayList<>();
            list.add(friend2);
            friendsMap.put(friend1, list);
        }
    }

    static void removeFriend(Map<String, List<String>> friendsMap, String friend1, String friend2){
        if(friend1.contains(friend2)) friendsMap.get(friend1).remove(friend2);
        else System.out.println("Friend 1 doesn't have friend 2");
    }

}
