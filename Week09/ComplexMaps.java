package week09;

import java.util.*;

public class ComplexMaps {
    private Map<String, List<String>> friendsMap = new HashMap<>();

    public static void main(String[] args) {
        ComplexMaps example = new ComplexMaps();

        example.addFriendPair("Ali", "Sadi");
        example.addFriendPair("Sadi", "Ulkar");
        example.addFriendPair("Ulkar", "Nijat");
        example.addFriendPair("Nijat", "Rovshan");

        example.printFriendsMap();
        example.removeFriendPair("Sadi", "Ali");
        example.printFriendsMap();
    }

    public void addFriendPair(String person1, String person2) {

        List<String> person1Friends = friendsMap.getOrDefault(person1, new ArrayList<>());
        person1Friends.add(person2);
        friendsMap.put(person1, person1Friends);

        List<String> person2Friends = friendsMap.getOrDefault(person2, new ArrayList<>());
        person2Friends.add(person1);
        friendsMap.put(person2, person2Friends);
    }

    public void removeFriendPair(String person1, String person2) {

        List<String> person1Friends = friendsMap.get(person1);
        if (person1Friends != null) {
            person1Friends.remove(person2);
            friendsMap.put(person1, person1Friends);
        }

        List<String> person2Friends = friendsMap.get(person2);
        if (person2Friends != null) {
            person2Friends.remove(person1);
            friendsMap.put(person2, person2Friends);
        }
    }

    public void printFriendsMap() {

        System.out.println("Friends Map:");
        for (Map.Entry<String, List<String>> entry : friendsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }
}
