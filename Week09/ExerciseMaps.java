package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExerciseMaps {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        
        ages.put("Leyla", 17);
        ages.put("Mae", 17);
        ages.put("Fikret", 18);
        ages.put("Hope", 16);

        for (String x : ages.keySet()) {
            System.out.println("Key is "+ x + ", value is " + ages.get(x));
        }
    
        for (Map.Entry<String, Integer> a : ages.entrySet()) {
            System.out.println("Key is "+ a.getKey() + " and value is " + a.getValue());
        }
        

        ArrayList<String> name = new ArrayList<>();

    
    }
}