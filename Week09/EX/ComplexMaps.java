import java.util.HashMap;
import java.util.ArrayList;

public class ComplexMaps {
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> friendsMap = new HashMap<>();
        addFriend(friendsMap, "Nilufar", "Gulara");
        addFriend(friendsMap, "Nilufar", "Aykhan");
        System.out.println(friendsMap);
    }

    static void addFriend(HashMap<String, ArrayList<String>> friendsMap, String who, String friend){
        if(friendsMap.containsKey(who)){
        friendsMap.get(who).add(friend);
    }else{
        ArrayList<String> list = new ArrayList<>();
        list.add(friend);
        friendsMap.put(who, list);
    }
    if(friendsMap.containsKey(friend)){
        friendsMap.get(friend).add(who);
    }else{
        ArrayList<String> list = new ArrayList<>();
        list.add(who);
        friendsMap.put(friend, list);
    }
    }
}
