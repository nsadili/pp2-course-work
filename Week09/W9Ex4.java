import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W9Ex4 {
    public static void main(String[] args) {

        Map<String, List<String>> friends = new HashMap<>();

        System.out.println(friends.get("Nuraddin"));

        addPairOfFriends(friends, "Nuraddin", "Shamil");
        addPairOfFriends(friends, "Nuraddin", "Laman");
        addPairOfFriends(friends, "Nuraddin", "Vasila");
        

        for(String name : friends.keySet())
            System.out.println(name + ": " + friends.get(name));
    }

    static void addPairOfFriends(Map<String, List<String>> friends, String f1, String f2) {
            
        if(friends.containsKey(f1))
        friends.get(f1).add(f2);
    else {
        var list = new ArrayList<String>();
        list.add(f2);
        friends.put(f1, list);
    }

            if(friends.containsKey(f2))
                friends.get(f2).add(f1);
            else {
                var list = new ArrayList<String>();
                list.add(f1);
                friends.put(f2, list);
            }
    }
  
    }
}
