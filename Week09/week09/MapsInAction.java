package pp2.week09;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapsInAction {
    public static void main (String args[]){
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ayla", 18);
        ages.put("Khavar", 17);
        ages.put("Kubra", 14);

        for (String s : ages.keySet()){
            System.out.println(s);
        }

        TreeMap<String, Integer> ages2 = new TreeMap<>();
        ages2.put("Maryam", 16);
        ages2.put("Emil", 17);
        ages2.put("Craig", 8);

        for (String s : ages2.keySet()){
            System.out.println(s);
        }


    }
}
