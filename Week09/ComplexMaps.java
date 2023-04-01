import java.util.*;
public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();
        addFriend(friends, "Vusat", "Naik");
        addFriend(friends, "Vusat", "Vasila");
        addFriend(friends, "Nuraddin", "Vasila");
        addFriend(friends, "Nuraddin", "Naik");
        addFriend(friends, "Naik", "Narmina");
        System.out.println(friends);

    }

    static void addFriend(Map<String, List<String>> friends, String friend1, String friend2) {
       addToMap(friends, friend1, friend2);
       addToMap(friends, friend2, friend1);

    }

    static void addToMap(Map<String, List<String>> map, String key, String value) {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        } else{ 
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    static boolean removeAFriend(Map<String, List<String>> friends, String f1, String f2) {
        if(!friends.containsKey(f1)) return false;
        if(!friends.get(f1).contains(f2)) return false;
        if(friends.get(f1)==null) System.out.println("friend does not exist");
        else {
            friends.get(f1).remove(f2);
        }
        if(friends.get(f2)==null) System.out.println("friend does not exist");
        else {
            friends.get(f2).remove(f1);
        }
        return true;
    }
}
