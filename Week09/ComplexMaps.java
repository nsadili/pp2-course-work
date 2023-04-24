package Week09;

import java.util.*;

public class ComplexMaps {
    private Map<String, List<String>> friendsMap;

    public ComplexMaps() {
        this.friendsMap = new HashMap<>();
    }

    public void addFriends(String friend1, String friend2) {
        if (!friendsMap.containsKey(friend1)) {
            friendsMap.put(friend1, new ArrayList<>());
        }
        if (!friendsMap.containsKey(friend2)) {
            friendsMap.put(friend2, new ArrayList<>());
        }
        friendsMap.get(friend1).add(friend2);
        friendsMap.get(friend2).add(friend1);
    }

    public void removeFriends(String friend1, String friend2) {
        if (friendsMap.containsKey(friend1) && friendsMap.containsKey(friend2)) {
            friendsMap.get(friend1).remove(friend2);
            friendsMap.get(friend2).remove(friend1);
        }
    }

    public Map<String, List<String>> getFriendsMap() {
        return friendsMap;
    }

    public static void main(String[] args) {
        ComplexMaps complexMaps = new ComplexMaps();
        complexMaps.addFriends("Ali", "Sadi");
        complexMaps.addFriends("Sadi", "Ahmed");
        System.out.println(complexMaps.getFriendsMap());
        // Output: {Ali=[Sadi], Sadi=[Ali, Ahmed], Ahmed=[Sadi]}

        complexMaps.removeFriends("Sadi", "Ahmed");
        System.out.println(complexMaps.getFriendsMap());
        // Output: {Ali=[Sadi], Sadi=[Ali], Ahmed=[]}
    }
}
