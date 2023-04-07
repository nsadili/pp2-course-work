package EX;
import java.util.*;

public class FriendsMap {
    
    HashMap<String, List<String>> friendsMap = new HashMap<String, List<String>>();

    public void addFriendPair(String friend1, String friend2) {


        List<String> friend2List = friendsMap.get(friend2);
        if (friend2List == null) {
            friend2List = new ArrayList<String>();
            friendsMap.put(friend2, friend2List);
        }
        friend2List.add(friend1);



        List<String> friend1List = friendsMap.get(friend1);
        if (friend1List == null) {
            friend1List = new ArrayList<String>();
            friendsMap.put(friend1, friend1List);
        }
        friend1List.add(friend2);
    }




    public void removeFriendPair(String friend1, String friend2) {
        List<String> friend2List = friendsMap.get(friend2);
        if (friend2List != null) {
            friend2List.remove(friend1);
            if (friend2List.size() == 0) {
                friendsMap.remove(friend2);
            }
        }



        List<String> friend1List = friendsMap.get(friend1);
        if (friend1List != null) {
            friend1List.remove(friend2);
            if (friend1List.size() == 0) {
                friendsMap.remove(friend1);
            }
        }
    }
}
