import java.util.*;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        System.out.println("HashMap");

        ages.put("A", 1);
        ages.put("B", 2);
        ages.put("C", 3);

        for(String s : ages.keySet()){
            System.out.println(s);
        }

        TreeMap<String, Integer> ages2 = new TreeMap<>();
        System.out.println("TreeMap");

        ages2.put("C", 3);
        ages2.put("A", 1);
        ages2.put("B", 2);

        for(String s : ages2.keySet()){
            System.out.println(s);
        }

    }
}