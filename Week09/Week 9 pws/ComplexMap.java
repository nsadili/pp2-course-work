import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new HashMap<>();

        addPairOfFriends(friends, "Xuraman", "Seljan");
        addPairOfFriends(friends, "Xuraman", "Nazrin");

        addPairOfFriends(friends, "Nazrin", "Taleh");

        for (String name : friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));

        }

        removeFriend(friends, "Xuraman", "Seljan");

        for (String name : friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));

        }

    }

    static void addPairOfFriends(Map<String, List<String>> friends, String f1, String f2) {
         addToMap(friends, f1, f2);
        addToMap(friends, f2, f1);
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

    static boolean removeFriend(Map<String, List<String>> friends, String f1, String f2) {

        if (!(friends.containsKey(f1)))
            return false;
        if (!(friends.get(f1).contains(f2)))
            return false;

        friends.get(f1).remove(f2);
        friends.get(f2).remove(f1);
        return true;

    }
}