package Week09.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new HashMap<>();
        
        AddPairOfFriends(friends, "Murad", "Ahmed");
        AddPairOfFriends(friends, "Murad", "Jesika");
        AddPairOfFriends(friends, "Jesika", "Eynulla");
        System.out.println(RemoveAFriendFromMap(friends, "Murad", "Ahmed"));
        System.out.println(RemoveAFriendFromMap(friends, "Tom", "Ahmed"));
        System.out.println(RemoveAFriendFromMap(friends, "Eynulla", "Ahmed"));

        System.out.println(friends);
        System.out.println();

        for (var name : friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));
        }
    }

    static void AddPairOfFriends(Map<String, List<String>> friends,
            String f1, String f2) {
        AddToMap(friends, f1, f2);
        AddToMap(friends, f2, f1);
    }

    static void AddToMap(Map<String, List<String>> map, String key, String value) {

        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            var list = new ArrayList<String>();
            list.add(value);
            map.put(key, list);
        }
    }

    static boolean RemoveAFriendFromMap(Map<String, List<String>> friends,
            String f1, String f2) {

        if (!friends.containsKey(f1))
            return false;

        if (!friends.get(f1).contains(f2))
            return false;

        friends.get(f1).remove(f2);
        friends.get(f2).remove(f1);
        return true;
    }
}
