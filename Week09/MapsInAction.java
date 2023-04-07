import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapsInAction {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("Bahruz", 19);
        ages.put("Zeynal",23);
        ages.put("Leman", 23);
        ages.put("Mireli", 18);
        ages.put("Aysun",19);
        ages.put("Lale",20);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());
            
        System.out.println(list);

     list.sort(new Comparator<Map.Entry<String, Integer>>() {

       

        @Override
        public int compare(Entry<String, Integer> A1, Entry<String, Integer> A2) 
        {
          return A2.getValue() - A1.getValue();
        }
        
     });

     System.out.println(list);

    }

}

