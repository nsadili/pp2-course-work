package Week09.ex04;

import java.util.*;

public class ComplexMaps {

    private Map<String, List<String>> friendsMap;

    public ComplexMaps() {
        friendsMap = new HashMap<>();
    }

    public void addFriends(String person, String friend) {
        List<String> personFriends = friendsMap.getOrDefault(person, new ArrayList<>());

        personFriends.add(friend);
        friendsMap.put(person, personFriends);

        List<String> friendFriends = friendsMap.getOrDefault(friend, new ArrayList<>());
        friendFriends.add(person);
        friendsMap.put(friend, friendFriends);
    }

    public void removeFriends(String person, String friend) {
        List<String> personFriends = friendsMap.getOrDefault(person, new ArrayList<>());
        personFriends.remove(friend);
        friendsMap.put(person, personFriends);

        List<String> friendFriends = friendsMap.getOrDefault(friend, new ArrayList<>());
        friendFriends.remove(person);
        friendsMap.put(friend, friendFriends);
    }

    public Map<String, List<String>> getFriendsMap() {
        return friendsMap;
    }

    public static void main(String[] args) {
        ComplexMaps cm = new ComplexMaps();

        cm.addFriends("Ali", "Sadiq");
        cm.addFriends("Ali", "Samir");
        cm.addFriends("Sadiq", "Meryem");
        cm.removeFriends("Ali", "Samir");

        System.out.println(cm.getFriendsMap());
    }

}
