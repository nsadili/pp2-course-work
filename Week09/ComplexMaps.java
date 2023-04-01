import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends =  new HashMap<>();
        
        addAPairOfFriends(friends, "Nariman", "Shamil");
        addAPairOfFriends(friends, "Arzum", "Shamil");
        addAPairOfFriends(friends, "Rufat", "Arzum");
        addAPairOfFriends(friends, "Rufat", "Shamil");

        for(String name : friends.keySet()){
            System.out.println(name +": "+friends.get(name));
        }
        
        System.out.println();

        removeAPairOfFriends(friends, "Shamil", "Arzum");

        for(String name : friends.keySet()){
            System.out.println(name +": "+friends.get(name));
        }

    }

    static void addAPairOfFriends(Map<String, List<String>> friends, String s1, String s2){
        addToMap(friends, s1, s2);
        addToMap(friends, s2, s1);

    }

    static void removeAPairOfFriends(Map<String, List<String>> friends, String s1, String s2){
        if(!friends.containsKey(s1)) System.out.println(String.format("<%s> does not exist in the friends map", s1));

        else if (!friends.get(s1).contains(s2)) System.out.println(String.format("<%s> does not exist in the friends list of <%s>", s2, s1));

        else removefromMap(friends, s1, s2);
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

    static void removefromMap(Map<String, List<String>> friends, String s1, String s2){
        friends.get(s1).remove(s2);
        friends.get(s2).remove(s1);
    }

}
