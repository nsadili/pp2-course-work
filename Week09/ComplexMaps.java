import java.util.*;
public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friends= new HashMap<>();
        AddPairOfFriends(friends,"Nuraddin", "Shamil");
        AddPairOfFriends(friends,"Nuraddin", "Laman");
        AddPairOfFriends(friends,"Laman", "Vasila");
        removeAFriend(friends,"Nuraddin", "Shamil");
        removeAFriend(friends,"Mahammad", "Shamil");
        removeAFriend(friends,"Vasila", "Shamil");
        for(String name: friends.keySet()){
            System.out.println(name+": "+ friends.get(name));
        }
    }

    static void AddPairOfFriends(Map<String,List<String>> friends,
        String f1,String f2){
            addToMap(friends,f1,f2);
            addToMap(friends,f2,f1);

    }

    static void addToMap(Map<String,List<String>> map, String key, String value){
        if (map.containsKey(key)){
            map.get(key).add(value);
        }
        else{
            var list = new ArrayList<String>();
            list.add(value);
            map.put(key,list);
        }
    }

    static boolean removeAFriend(Map<String,List<String>> friends,
    String f1,String f2){
        if(friends.containsKey(f1)){
            return false;
        }
        if(!friends.get(f1).contains(f2)){
            return false;
        }

        friends.get(f1).remove(f2);
        return true;
    }
}
