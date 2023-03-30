import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps{
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();

        addFriendsPair(friends,"Nuraddin", "Leyla");
        addFriendsPair(friends,"Nuraddin", "Nihat");
        addFriendsPair(friends,"Ali", "Leyla");
        addFriendsPair(friends,"Nihat", "Leyla");

        for(var entry: friends.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }


        
    }
    static void addFriendsPair(Map<String, List<String>> friends, String friend1, String friend2){
        // if(friends.containsKey(friend1)){
        //     List<String> list = new ArrayList<>();
        //     list.add(friend2);
        //     friends.put(friend1, list);
        // } else {
        //     friends.get(friend1).add(friend2);
        // }

        if(friends.containsKey(friend2)){
            List<String> list = new ArrayList<>();
            list.add(friend1);
            friends.put(friend2, list);
        } else {
            friends.get(friend1).add(friend2);
        }

        addToMap(friends, friend1, friend2);
        
    }

    static void addToMap(Map<String, List<String>> map, String key, String value){
        
        if(map.containsKey(key)){
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        } else {
            map.get(key).add(value);
        }
    }
}