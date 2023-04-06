import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        
        Map<String, List<String>> friends = new HashMap<>();

        addFriend(friends, "Vusat", "Naik");
        addFriend(friends, "Vusat", "Vasila");
        addFriend(friends, "Nuraddin", "Naik");


        System.out.println(friends);


    }

    static void addFriend(Map<String, List<String>> friends, String friend1, String friend2){
        if(friends.containsKey(friend1)){
            friends.get(friend1).add(friend2);
        }else {
            List<String> list = new ArrayList<>();
        list.add(friend2);
        friends.put(friend1, list);
        }
    }
}
