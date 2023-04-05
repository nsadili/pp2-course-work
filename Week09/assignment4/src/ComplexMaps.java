import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    private Map<String, List<String>> friendsMap;

    public ComplexMaps() {
        this.friendsMap = new HashMap<>();
    }

    public void addFriendPair(String friend1, String friend2) {
        List<String> friend1List = friendsMap.getOrDefault(friend1, new ArrayList<>());
        friend1List.add(friend2);
        friendsMap.put(friend1, friend1List);

        List<String> friend2List = friendsMap.getOrDefault(friend2, new ArrayList<>());
        friend2List.add(friend1);
        friendsMap.put(friend2, friend2List);
    }

    public void removeFriendPair(String friend1, String friend2) {
        List<String> friend1List = friendsMap.get(friend1);
        if (friend1List != null) {
            friend1List.remove(friend2);
            if (friend1List.isEmpty()) {
                friendsMap.remove(friend1);
            }
        }

        List<String> friend2List = friendsMap.get(friend2);
        if (friend2List != null) {
            friend2List.remove(friend1);
            if (friend2List.isEmpty()) {
                friendsMap.remove(friend2);
            }
        }
    }
}
