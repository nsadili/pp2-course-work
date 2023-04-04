import java.util.*;

public class ComplexMaps {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> friendsMap = new HashMap<String, ArrayList<String>>();
  
        addPairOfFriends(friendsMap, "Ali", "Nihat");
        addPairOfFriends(friendsMap, "Ali", "Ravan");
        addPairOfFriends(friendsMap, "Ali", "Hazrat");
        addPairOfFriends(friendsMap, "Nihat", "Ravan");
        addPairOfFriends(friendsMap, "Nihat", "Hazrat");
        addPairOfFriends(friendsMap, "Nihat", "Hazrat");

        System.out.println("Friends Map: ");
        for (String key : friendsMap.keySet()) {
            System.out.println(key + " - " + friendsMap.get(key));
        }
      
        removePairOfFriends(friendsMap, "Ali", "Nihat");
   
        System.out.println("Friends Map: ");
        for (String key : friendsMap.keySet()) {
            System.out.println(key + " - " + friendsMap.get(key));
        }
    }

    public static void addPairOfFriends(HashMap<String, ArrayList<String>> friendsMap, String name1, String name2) {

        if (friendsMap.containsKey(name1)) {
            friendsMap.get(name1).add(name2);
        } else {
            ArrayList<String> friends = new ArrayList<String>();
            friends.add(name2);
            friendsMap.put(name1, friends);
        }

        if (friendsMap.containsKey(name2)) {
            friendsMap.get(name2).add(name1);
        } else {
            ArrayList<String> friends = new ArrayList<String>();
            friends.add(name1);
            friendsMap.put(name2, friends);
        }
    }

    public static void removePairOfFriends(HashMap<String, ArrayList<String>> friendsMap, String name1, String name2) {

        if (friendsMap.containsKey(name1)) {
            friendsMap.get(name1).remove(name2);
        }
 
        if (friendsMap.containsKey(name2)) {
            friendsMap.get(name2).remove(name1);
        }
    }
}
