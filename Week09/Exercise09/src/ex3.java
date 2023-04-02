import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex3 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("A", 20);
        ages.put("B", 25);
        ages.put("C", 22);

        for (String s: ages.keySet()) {
            System.out.println(s);
        }

        System.out.println();

        Map<String, Integer> ages2 = new TreeMap<>();
        ages2.put("A", 20);
        ages2.put("F", 25);
        ages2.put("C", 22);

        for (String s: ages2.keySet()) {
            System.out.println(s);
        }
    }
}