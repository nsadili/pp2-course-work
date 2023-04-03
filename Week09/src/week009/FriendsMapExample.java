package week009;

import java.util.*;

public class FriendsMapExample {
	public static void main(String[] args) {
		HashMap<String, List<String>> friendsMap = new HashMap<String, List<String>>();

		addFriends("Ali", "Sadi", friendsMap);
		addFriends("Ali", "Ahmed", friendsMap);
		addFriends("Sadi", "Ahmed", friendsMap);

		System.out.println("Friends of Ali: " + friendsMap.get("Ali"));

		removeFriends("Ali", "Sadi", friendsMap);

		System.out.println("Friends of Ali after removing (Ali, Sadi) pair: " + friendsMap.get("Ali"));
	}

	public static void addFriends(String friend1, String friend2, HashMap<String, List<String>> friendsMap) {

		List<String> friend2List = friendsMap.getOrDefault(friend2, new ArrayList<String>());
		friend2List.add(friend1);
		friendsMap.put(friend2, friend2List);

		List<String> friend1List = friendsMap.getOrDefault(friend1, new ArrayList<String>());
		friend1List.add(friend2);
		friendsMap.put(friend1, friend1List);
	}

	public static void removeFriends(String friend1, String friend2, HashMap<String, List<String>> friendsMap) {

		List<String> friend2List = friendsMap.getOrDefault(friend2, new ArrayList<String>());
		friend2List.remove(friend1);
		friendsMap.put(friend2, friend2List);

		List<String> friend1List = friendsMap.getOrDefault(friend1, new ArrayList<String>());
		friend1List.remove(friend2);
		friendsMap.put(friend1, friend1List);
	}
}
