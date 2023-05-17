import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        
        Map<String, List<String>> friends = new HashMap<>();

        addFriendsPair(friends, "Fidan", "Yunis");
        addFriendsPair(friends, "Fidan", "Pasha");
        addFriendsPair(friends, "Madina", "Nermin");

        System.out.println(removeFriend(friends, "Fidan", "Yunis"));
        System.out.println(removeFriend(friends, "Narmin", "Ramile"));
        System.out.println(removeFriend(friends, "Madina", "Ramile"));

        for(var entry: friends.entrySet()){
            System.out.println(entry.getKey()+ "->"+ entry.getValue());
        }



    }

    static void addFriendsPair(Map<String, List<String>> friends, String friend1, String friend2){

        addToMap(friends, friend1, friend2);
        addToMap(friends, friend2, friend1);
    }

    static void addToMap(Map<String, List<String>> map, String key, String value){

        if (!map.containsKey(key)){
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);            
        }
        else {
            map.get(key).add(value);
        }
        
    }


    static boolean removeFriend(Map<String, List<String>> friends, String friend1, String friend2){
        
        if(!friends.containsKey(friend1))
           return false;


        if (!friends.get(friend1).contains(friend2)) return false;

        friends.get(friend1).remove(friend2);
        
        return true;


    }
}
