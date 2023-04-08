import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends= new HashMap<>();
        if(friends.containsKey("Vusat")){
            friends.get("Vusat").add("Naik");
        }else{
            List<String> list=new ArrayList<>();
            list.add("Naik");
            friends.put("Vusat", list);
        }
        System.out.println(friends);
    }

    static void addFriend(Map<String, List<String>> friends, String friend1, String friend2){
        if(friends.containsKey(friend1)){
            friends.get(friend1).add(friend2);
        }else{
            List<String> list=new ArrayList<>();
            list.add(friend2);
            friends.put(friend1, list);
        }
        if(friends.containsKey(friend2)){
            friends.get(friend2).add(friend1);
        }else{
            List<String> list=new ArrayList<>();
            list.add(friend1);
            friends.put(friend2, list);
        }

    }
    static void addToMap(Map<String, List<String>> map, String key, String value){
        if(map.containsKey(key)){
            map.get(key).add(value);
        }else{
            List<String> list=new ArrayList<>();
            list.add(value);
            map.put(key , list);
        }
    }
}
