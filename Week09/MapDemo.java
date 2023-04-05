import java.util.*;

public class MapDemo{
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Sadiq", 19);
        
        for(Map.Entry<String,Integer> entry: ages.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    
}