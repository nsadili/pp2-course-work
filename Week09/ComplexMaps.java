package Week09;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
public class ComplexMaps {
    public static void main(String[] args) {
    Map<String, List<String>> friends = new TreeMap<>();
    addAPairoffFriends(friends, "Ilaha", "Laman");
    addAPairoffFriends(friends, "Sabina", "Nicat");
    addAPairoffFriends(friends, "Mahammad", "Arzum");
    
    System.out.println(removeAPairoffFriends(friends, "Ilaha", "Laman" ));
    System.out.println(removeAPairoffFriends(friends, "Sabina", "Nicat"));
    System.out.println(removeAPairoffFriends(friends, "Mahammad", "Arzum"));
    
    
    for (String name: friends. keyset ()){
        System.out.printIn(name + ":" + friends.get(name));
    }
    
    private static char[] removeAPairoffFriends(Map<String, List<String>> friends, String string, String string2) {
        return null;
    }

    static void addAPairoffFriends (Map<String>, List<String>> friends, String f1, String f2) {
    addToMap(friends, f1, f2);
    addToMap(friends, f2, f1);
    }