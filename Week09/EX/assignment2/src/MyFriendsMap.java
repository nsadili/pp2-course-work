import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyFriendsMap {

    private Map<String, List<String>> friendsMap;

    public MyFriendsMap() {
        friendsMap = new HashMap<>();
    }

    public void addFriends(String person1, String person2) {
        List<String> person1Friends = friendsMap.getOrDefault(person1, new ArrayList<>());
        person1Friends.add(person2);
        friendsMap.put(person1, person1Friends);

        List<String> person2Friends = friendsMap.getOrDefault(person2, new ArrayList<>());
        person2Friends.add(person1);
        friendsMap.put(person2, person2Friends);
    }

    public void removeFriends(String person1, String person2) {
        List<String> person1Friends = friendsMap.get(person1);
        if (person1Friends != null) {
            person1Friends.remove(person2);
            if (person1Friends.isEmpty()) {
                friendsMap.remove(person1);
            } else {
                friendsMap.put(person1, person1Friends);
            }
        }

        List<String> person2Friends = friendsMap.get(person2);
        if (person2Friends != null) {
            person2Friends.remove(person1);
            if (person2Friends.isEmpty()) {
                friendsMap.remove(person2);
            } else {
                friendsMap.put(person2, person2Friends);
            }
        }
    }

    public static void main(String[] args) {
        MyFriendsMap map = new MyFriendsMap();

        map.addFriends("Omer", "Faruk");
        map.addFriends("Omer", "Ali");
        map.addFriends("Faruk", "Eren");
        map.addFriends("Ali", "Shashal");

        System.out.println("Using Enhanced for statement:");
        for (Map.Entry<String, List<String>> entry : map.friendsMap.entrySet()) {
            String person = entry.getKey();
            List<String> friends = entry.getValue();
            System.out.println(person + ": " + friends);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<String, List<String>>> iterator = map.friendsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            String person = entry.getKey();
            List<String> friends = entry.getValue();
            System.out.println(person + ": " + friends);
        }

        System.out.println("\nUsing toString():");
        System.out.println(map.friendsMap);

        TreeMap<String, List<String>> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(map.friendsMap);
        System.out.println("\nTreeMap in an alphabetically non-ascending order:");
        System.out.println(treeMap);

    }
}