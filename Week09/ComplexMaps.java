package Week09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new TreeMap<>();
        addAPairOfFriends(friends, "Ilaha", "Laman");
        addAPairOfFriends(friends, "Sabina", "Nicat");
        addAPairOfFriends(friends, "Mahammad", "Arzum");

        System.out.println(removeAPairOfFriends(friends, "Ilaha", "Laman"));
        System.out.println(removeAPairOfFriends(friends, "Sabina", "Nicat"));
        System.out.println(removeAPairOfFriends(friends, "Mahammad", "Arzum"));

        for (String name : friends.keySet()) {
            System.out.println(name + ":" + friends.get(name));
        }
    }

    static void addAPairOfFriends(Map<String, List<String>> friends, String f1, String f2) {
        addToMap(friends, f1, f2);
        addToMap(friends, f2, f1);
    }

    static void addToMap(Map<String, List<String>> friends, String name, String friend) {
        List<String> friendList = friends.getOrDefault(name, new ArrayList<>());
        friendList.add(friend);
        friends.put(name, friendList);
    }

    static List<String> removeAPairOfFriends(Map<String, List<String>> friends, String f1, String f2) {
        List<String> removedFriends = friends.remove(f1);
        if (removedFriends != null) {
            friends.getOrDefault(f2, new ArrayList<>()).remove(f1);
        }
        return removedFriends;
    }
}
