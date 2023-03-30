import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {
        
        Map<String, List<String>> friends = new HashMap<>();

        AddPairOfFriends(friends, "Shamil", "Nuraddin");

        System.out.println(friends.get("Nuraddin"));

    }

    static void AddPairOfFriends(Map<String, List<String>> friends, String f1, String f2) {

    }
}
