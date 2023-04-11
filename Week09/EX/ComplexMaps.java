package EX;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new HashMap<>();

        addFriendsPair(friends, "Ibrahim", "Nihat");
        addFriendsPair(friends, "Nihat", "Ibrahim");
        addFriendsPair(friends, "Huseyn", "Fuad");
        addFriendsPair(friends, "Fuad", "Huseyn");

    }

    static void addFriendsPair(Map<String, List<String>> friends, String friend1, String friend2)
            friends.put(friend1, new ArrayList<>());
            {
            if(!friends.containsKey(friend1)){
                List<String> list = new ArrayList<>();

                list.add(friend2);

                friends.put(friend2, list);
            }
            else {
                friends.get(friend1).add(friend2);
            }
            
            if(!friends.containsKey(friend1)){
                List<String> list = new ArrayList<>();

                list.add(friend1);

                friends.put(friend1, list);
            }
            else {
                friends.get(friend2).add(friend1);
            }
        }

    static void addToMap(Map<String, List<String>> map, String key, String value) {

    }

}
