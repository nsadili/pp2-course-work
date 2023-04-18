package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComplexMaps {
    public static void main(String[] args) {
        HashMap<String,List<String>> friendMap=new HashMap<String,List<String>>();

        addFriendsPair(friendMap,"Ali","Ulvi");
        addFriendsPair(friendMap,"Ali","Nihat");
        addFriendsPair(friendMap,"Banu","Ulvi");
        addFriendsPair(friendMap,"Ali","Sama");
        removeFriendsPair(friendMap, "Sama", "Ulvi");
        System.out.println(friendMap.get("Ulvi"));
        removeFriendsPair(friendMap, "Banu", "Ulvi");
        System.out.println(friendMap.get("Ulvi"));

    }

    static public void addFriendsPair(HashMap<String,List<String>> friends,String f1,String f2) {
        if(!friends.containsKey(f1)) {
            friends.put(f1, new ArrayList<String>());
            friends.get(f1).add(f2);
        } else friends.get(f1).add(f2);

        if(!friends.containsKey(f2)) {
            friends.put(f2, new ArrayList<String>());
            friends.get(f2).add(f1);
        } else friends.get(f2).add(f1);
    }

    static public void removeFriendsPair(HashMap<String,List<String>> friends,String f1,String f2) {
        if(!friends.containsKey(f1) || !friends.get(f1).contains(f2)) {
            System.out.println("No such friend pair");
            return;
        } else friends.get(f1).remove(f2);

        if(!friends.containsKey(f2) || !friends.get(f2).contains(f1)) {
            System.out.println("No such friend pair");
            return;
        } else friends.get(f2).remove(f1);
    }
}
