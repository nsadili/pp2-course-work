import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new HashMap<>();

        // System.out.println(friends.get("Nuraddin"));

        AddPairOfFriends(friends, "Nuraddin", "Shamil");
        AddPairOfFriends(friends, "Nuraddin", "Laman");
        AddPairOfFriends(friends, "Laman", "Vasila");

        // RemoveAFriendFromMap(friends, "Nuraddin", "Shamil");
        // RemoveAFriendFromMap(friends, "Mahammad", "Shamil");
        // RemoveAFriendFromMap(friends, "Vasila", "Shamil");

        System.out.println(RemoveAFriendFromMap(friends, "Nuraddin", "Shamil"));
        System.out.println(RemoveAFriendFromMap(friends, "Mahammad", "Shamil"));
        System.out.println(RemoveAFriendFromMap(friends, "Vasila", "Shamil"));

        System.out.println(friends);
        System.out.println();

        for (var name : friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));
        }
    }

    static void AddPairOfFriends(Map<String, List<String>> friends,
            String f1, String f2) {

        // if (friends.containsKey(f1)) {
        // friends.get(f1).add(f2);
        // } else {
        // var list = new ArrayList<String>();
        // list.add(f2);
        // friends.put(f1, list);
        // }

        // if (friends.containsKey(f2)) {
        // friends.get(f2).add(f1);
        // } else {
        // var list = new ArrayList<String>();
        // list.add(f1);
        // friends.put(f2, list);
        // }

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
