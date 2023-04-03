import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ComplexMaps {
    private Map<String, List<String>> friendsMap;

    public ComplexMaps() {
        friendsMap = new HashMap<>();
    }

    public void addFriend(String name1, String name2) {
        List<String> friends1 = friendsMap.getOrDefault(name1, new ArrayList<>());
        List<String> friends2 = friendsMap.getOrDefault(name2, new ArrayList<>());
        friends1.add(name2);
        friends2.add(name1);
        friendsMap.put(name1, friends1);
        friendsMap.put(name2, friends2);
    }

    public void removeFriend(String name1, String name2) {
        List<String> friends1 = friendsMap.getOrDefault(name1, new ArrayList<>());
        List<String> friends2 = friendsMap.getOrDefault(name2, new ArrayList<>());
        friends1.remove(name2);
        friends2.remove(name1);
        if (friends1.isEmpty()) {
            friendsMap.remove(name1);
        } else {
            friendsMap.put(name1, friends1);
        }
        if (friends2.isEmpty()) {
            friendsMap.remove(name2);
        } else {
            friendsMap.put(name2, friends2);
        }
    }

    public static void main(String[] args) {
        ComplexMaps friendMap = new ComplexMaps();
        Scanner sc = new Scanner(System.in);
        while (true) {
        //Enter command (add or remove) and two names separated by spaces, or type 'exit' to quit:
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                System.out.println("Invalid input, please enter two names separated by a space.");
                continue;
            }
            String command = tokens[0];
            String name1 = tokens[1];
            String name2 = tokens[2];
            if (command.equalsIgnoreCase("add")) {
                friendMap.addFriend(name1, name2);
                System.out.println("Added friendship between " + name1 + " and " + name2);
            } else if (command.equalsIgnoreCase("remove")) {
                friendMap.removeFriend(name1, name2);
                System.out.println("Removed friendship between " + name1 + " and " + name2);
            } else {
                System.out.println("Invalid command, please enter either 'add' or 'remove'.");
            }
            System.out.println("Current friend map: " + friendMap.friendsMap);
        }
    }
}
