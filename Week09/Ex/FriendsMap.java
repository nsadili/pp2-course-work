package Ex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsMap {
    private Map<String, List<String>> friendsMap;

    public FriendsMap() {
        friendsMap = new HashMap<>();
    }


    
    public void addFriend(String person, String friend) {
        // Adds the person-friend pair
        List<String> personFriends = friendsMap.getOrDefault(person, new ArrayList<>());
        personFriends.add(friend);
        friendsMap.put(person, personFriends);

        // Adds the friend-person pair
        List<String> friendFriends = friendsMap.getOrDefault(friend, new ArrayList<>());
        friendFriends.add(person);
        friendsMap.put(friend, friendFriends);
    }

    public void removeFriend(String person, String friend) {
        // Removess the person-friend pair
        List<String> personFriends = friendsMap.get(person);
        if (personFriends != null) {
            personFriends.remove(friend);
            if (personFriends.isEmpty()) {
                friendsMap.remove(person);
            }
        }

        // Removes the friend-person pair
        List<String> friendFriends = friendsMap.get(friend);
        if (friendFriends != null) {
            friendFriends.remove(person);
            if (friendFriends.isEmpty()) {
                friendsMap.remove(friend);
            }
        }
    }

    public Map<String, List<String>> getFriendsMap() {
        return friendsMap;
    }

    public static void main(String[] args) {
        FriendsMap map = new FriendsMap();

        // Add friends
        map.addFriend("Ali", "Sadi");
        map.addFriend("Ali", "Ragnar");
        map.addFriend("Sadi", "Bjorn");
        map.addFriend("Ragnar", "Bjorn");

        // Print the map
        System.out.println("Map after adding friends:");
        System.out.println(map.getFriendsMap());

        // Remove friends
        map.removeFriend("Ali", "Sadi");
        map.removeFriend("Ragnar", "Bjorn");

        // Print the map
        System.out.println("Map after removing friends:");
        System.out.println(map.getFriendsMap());
    }
}
