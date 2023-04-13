import java.util.*;

public class FriendsMap {

    public static void main(String[] args) {
        Map<String, List<String>> friendsMap = new HashMap<>();

        // add pairs of friends to the map
        addFriends(friendsMap, "Ali", "Said");
        addFriends(friendsMap, "Murad", "Riad");
        addFriends(friendsMap, "Musa", "Karim");

        System.out.println(friendsMap);

        // remove pairs of friends from the map
        removeFriends(friendsMap, "Murad", "Riad");

        System.out.println(friendsMap);
    }

    public static void addFriends(Map<String, List<String>> friendsMap, String friend1, String friend2) {
        // add friend1 to the friend list of friend2
        friendsMap.computeIfAbsent(friend2, k -> new ArrayList<>()).add(friend1);

        // add friend2 to the friend list of friend1
        friendsMap.computeIfAbsent(friend1, k -> new ArrayList<>()).add(friend2);
    }

    public static void removeFriends(Map<String, List<String>> friendsMap, String friend1, String friend2) {
        // remove friend1 from the friend list of friend2
        friendsMap.computeIfPresent(friend2, (k, v) -> {
            v.remove(friend1);
            return v;
        });

        // remove friend2 from the friend list of friend1
        friendsMap.computeIfPresent(friend1, (k, v) -> {
            v.remove(friend2);
            return v;
        });
    }
}
