import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();

        addAPairOfFriends(friends, "1", "2");
        addAPairOfFriends(friends, "3", "2");
        addAPairOfFriends(friends, "4", "3");

        removeAFriend(friends, "2", "1");
        removeAFriend(friends, "5", "1");
        removeAFriend(friends, "4", "1");



        for (String name : friends.keySet()) {
            System.out.println(name + ": " + friends.get(name));
            
        }

    }

    static void addAPairOfFriends(Map<String, List<String>> friends,
            String f1, String f2){
                addToMap(friends, f1, f2);
                addToMap(friends, f2, f1);
            }


    static void addToMap(Map<String, List<String>> map, String key, String value){
        if(map.containsKey(key)){
            map.get(key).add(value);
        }
        else{
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    static boolean removeAFriend(Map<String, List<String>> friends, String f1, String f2){
        
        if(!friends.containsKey(f1))
        return false;

        if(!friends.get(f1).contains(f2)) return false;

        friends.get(f1).remove(f2);
        friends.get(f2).remove(f1);
        return true;

    }
}