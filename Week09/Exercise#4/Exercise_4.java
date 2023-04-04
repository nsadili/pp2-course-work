import java.util.*; //this import helps us to import all the classes in the java.util package including those what we need: HashMap, TreeMap etc.


//writing main class by writing the name same to the name of the file (Exercsie_4.java)
//Here we define three different methods: add, remove and print. They will be explained later. 

public class Exercise_4 {
    private HashMap<String, List<String>> friendsMap;

    public Exercise_4() {
        friendsMap = new HashMap<>();
    }

    /*
    1. For addFriends method we take two String arguments, which will be the names of our friends and then
    declare them in the quantity of two: person1 and person2. 
    2. Then we begin to connect them with each other. So, we add person2 to the list of person1, and then person1 to
    the actual list of friends, which is friendsMap. FriendsMap must be declared before. It helps us to locate people's names
    in one list. 
     */

    public void addFriends(String person1, String person2) {
        if (!friendsMap.containsKey(person1)) {
            friendsMap.put(person1, new ArrayList<>());
        }
        if (!friendsMap.containsKey(person2)) {
            friendsMap.put(person2, new ArrayList<>());
        }
        friendsMap.get(person1).add(person2);
        friendsMap.get(person2).add(person1);
    }

    /*
    1. This method copies everything from method addFriends, but instead of using .add, we use .remove, so names in our
    list will be removed.
     */
    public void removeFriends(String person1, String person2) {
        if (friendsMap.containsKey(person1)) {
            friendsMap.get(person1).remove(person2);
        }
        if (friendsMap.containsKey(person2)) {
            friendsMap.get(person2).remove(person1);
        }
    }

    /*
    This method will show our result to the user. The printFriends method takes a single String argument, person,
     and prints out the list of friends for that person (very important note). If the person has no friends, then 
     a message is printed indicating this.
     */
    public void printFriends(String person) {
        if (!friendsMap.containsKey(person)) {
            System.out.println(person + "is lonely:(");
        } else {
            List<String> friends = friendsMap.get(person);
            System.out.print(person + " has " + friends.size() + " friend(s): ");
            for (String friend : friends) {
                System.out.print(friend + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise_4 map = new Exercise_4();
        map.addFriends("Ali", "Sadi");
        map.printFriends("Sadi");
        map.removeFriends("Ali", "Sadi");
        map.printFriends("Ali");
    }
}

/*
Please, "play" with names. You can remove ones and add others. It will help to understand how code works. Basically,
we can divide the final step of it on the processes:add and remove. So, I computer will understand what do you add, remove and
about what friend's information you want to get. 
 */