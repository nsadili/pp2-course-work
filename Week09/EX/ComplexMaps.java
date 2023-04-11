import java.util.*;

public class ComplexMaps {
    public static void main(String[] args) {
        System.out.println("a. Create a HashMap named friendsMap which will store a name of a person associated with a list of his/her friends.");
        HashMap<String, List<String>> friendsMap = new HashMap<>();
        System.out.println("b. Write a method to add a pair of friends in the friendsMap. Please, also note that, when you add Ali – Sadi pair in the map, you should add Sadi – Ali pair as well.");
        addFriendPair(friendsMap, "Ali", "Sadi");
        addFriendPair(friendsMap, "Ali", "Murad");
        addFriendPair(friendsMap, "Cavad", "Suat");
        System.out.println(friendsMap);
        System.out.println("c. Write a method to remove a pair of friends in the friendsMap. Consider the abovementioned rule too.");
        removeFriendPair(friendsMap, "Ali", "Sadi");
        System.out.println(friendsMap);
    }

    public static void addFriendPair(HashMap<String, List<String>> map, String person1, String person2) {
        if (!map.containsKey(person1)) {
            map.put(person1, new ArrayList<String>());
        }
        if (!map.containsKey(person2)) {
            map.put(person2, new ArrayList<String>());
        }
        List<String> friends1 = map.get(person1);
        List<String> friends2 = map.get(person2);
        friends1.add(person2);
        friends2.add(person1);
    }

    public static void removeFriendPair(HashMap<String, List<String>> map, String person1, String person2) {
        if (!map.containsKey(person1) || !map.containsKey(person2)) {
            return;
        }
        List<String> friends1 = map.get(person1);
        List<String> friends2 = map.get(person2);
        friends1.remove(person2);
        friends2.remove(person1);
        if (friends1.isEmpty()) {
            map.remove(person1);
        }
        if (friends2.isEmpty()) {
            map.remove(person2);
        }
    }
}
