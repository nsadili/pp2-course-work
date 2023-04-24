import java.util.*;

public class FriendsMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store friends and their associated friends
        Map<String, List<String>> friendsMap = new HashMap<>();
        
        // Add pairs of friends to the friendsMap
        addFriends(friendsMap, "Alice", "Bob");
        addFriends(friendsMap, "Bob", "Charlie");
        addFriends(friendsMap, "Charlie", "Dave");
        
        System.out.println("Friends Map: " + friendsMap);
        
        // Remove pairs of friends from the friendsMap
        removeFriends(friendsMap, "Bob", "Charlie");
        
        System.out.println("Friends Map after removing Bob-Charlie pair: " + friendsMap);
    }
    
    // Method to add a pair of friends to the friendsMap
    public static void addFriends(Map<String, List<String>> friendsMap, String person1, String person2) {
        // Add person2 to the friend list of person1
        List<String> friends1 = friendsMap.getOrDefault(person1, new ArrayList<>());
        friends1.add(person2);
        friendsMap.put(person1, friends1);
        
        // Add person1 to the friend list of person2
        List<String> friends2 = friendsMap.getOrDefault(person2, new ArrayList<>());
        friends2.add(person1);
        friendsMap.put(person2, friends2);
    }
    
    // Method to remove a pair of friends from the friendsMap
    public static void removeFriends(Map<String, List<String>> friendsMap, String person1, String person2) {
        // Remove person2 from the friend list of person1
        List<String> friends1 = friendsMap.get(person1);
        if (friends1 != null) {
            friends1.remove(person2);
            if (friends1.isEmpty()) {
                friendsMap.remove(person1);
            }
        }
        
        // Remove person1 from the friend list of person2
        List<String> friends2 = friendsMap.get(person2);
        if (friends2 != null) {
            friends2.remove(person1);
            if (friends2.isEmpty()) {
                friendsMap.remove(person2);
            }
        }
    }
}
