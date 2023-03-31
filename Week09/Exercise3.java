import java.util.HashMap;
import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("HashMap\n");
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ahmad", 10);
        ages.put("Akif", 30);
        ages.put("Zeynab", 20);

        for (String s : ages.keySet()){
            System.out.println(s);
        }

        System.out.println("\nTreemap\n");
        TreeMap<String, Integer> ages2 = new TreeMap<>();
        ages2.put("Ahmad", 10);
        ages2.put("Akif", 30);
        ages2.put("Zeynab", 20);

        for (String s : ages2.keySet()){
            System.out.println(s);
        }
    }
    
}
