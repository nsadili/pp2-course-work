import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends =  new HashMap<>();
        
        addAPairOfFriends(friends, "Nuraddin", "Shamil");
        addAPairOfFriends(friends, "Nuraddin", "Laman");
        addAPairOfFriends(friends, "Laman", "Vasila");

        for(String name : friends.keySet()){
            System.out.println(name +": "+friends.get(name));
        }
    }

    static void addAPairOfFriends(Map<String, List<String>> friends, String s1, String s2){
        addToMap(friends, s1, s2);
        addToMap(friends, s2, s1);

    }
    static void addToMap(Map<String, List<String>> friends, String s1, String s2){
        if(friends.containsKey(s1)){
            friends.get(s1).add(s2);
        }
        else{
            var list = new ArrayList<String>();
            list.add(s2);
            friends.put(s1, list);
        }
    }

}
