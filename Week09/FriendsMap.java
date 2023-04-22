package Week09;

import java.util.*;

public class FriendsMap {
    private HashMap<String, List<String>> friendsMap;

    public FriendsMap() {
        friendsMap = new HashMap<>();
    }

    public void addFriendPair(String friend1, String friend2) {
        if (!friendsMap.containsKey(friend1)) {
            friendsMap.put(friend1, new ArrayList<>());
        }
        if (!friendsMap.containsKey(friend2)) {
            friendsMap.put(friend2, new ArrayList<>());
        }
        friendsMap.get(friend1).add(friend2);
        friendsMap.get(friend2).add(friend1);
    }

    public void removeFriendPair(String friend1, String friend2) {
        if (friendsMap.containsKey(friend1) && friendsMap.containsKey(friend2)) {
            friendsMap.get(friend1).remove(friend2);
            friendsMap.get(friend2).remove(friend1);
            if (friendsMap.get(friend1).isEmpty()) {
                friendsMap.remove(friend1);
            }
            if (friendsMap.get(friend2).isEmpty()) {
                friendsMap.remove(friend2);
            }
        }
    }

    @Override
    public String toString() {
        return "FriendsMap{" +
                "friendsMap=" + friendsMap +
                '}';
    }

    public static void main(String[] args) {
        FriendsMap map = new FriendsMap();
        map.addFriendPair("Eynar", "Zaur");
        map.addFriendPair("Eynar", "Vaqif");
        System.out.println(map.friendsMap);
        map.removeFriendPair("Elvin", "Cavid");
        System.out.println(map.friendsMap);
    }
}