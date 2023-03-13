import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("johndoe", Arrays.asList("admin", "user"));
        System.out.println(user1.getUsername() + ": " + user1.getRoles());

        try {
            User user2 = new User("janedoe", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            User user3 = new User("bobsmith", new ArrayList<>());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}