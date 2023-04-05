import java.util.*;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, Integer> friendsMap = new HashMap<>();
    }

    public void addFriendPair(Map<String, List<String>> friendsMap, String p1, String p2 ){
        if(friendsMap.containsKey(p1)){
            friendsMap.get(p1).add(p2);
        }else{
            List<String> friends = new ArrayList<>();
            friends.add(p2);
            friendsMap.put(p1, friends);
        }

        if(friendsMap.containsKey(p2)){
            friendsMap.get(p2).add(p1);
        }
    }
}
