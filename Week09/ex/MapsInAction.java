import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsInAction{
    public static void main(String[] args) {
        //Map<String, Integer> ages = new HashMap<>(); HashMap does not guarantee the order
        //Map<String, Integer> ages = new LinkedHashMap<>(); //LinkedHashMap-the order in which they were inserted
        Map<String, Integer> ages = new TreeMap<>(
        //     new Comparator<String>(){
        //     @Override
        //     public int compare(String o1, String o2){
        //         return o2.length()-o1.length();  
        //     }
        // }
        ); //alphabetical order

        ages.put("Leyla", 18);
        ages.put("Elvin", 17);
        ages.put("Nariman", 19);
        ages.put("Nuraddin", 30);
        ages.put("Nihat", 19);

        // System.out.println(ages);

        // for(var key: ages.keySet()){ // var or String
        //     System.out.println(key+": "+ ages.get(key)); // get(key) helps us to take value
        // }

        // Iterator<String> it = ages.keySet().iterator();
        // while (it.hasNext()){
        //     var key = it.next(); // we have to store this value, if not it will fail
        //     System.out.println(key+": "+ages.get(key));
        // }

        for(Map.Entry<String, Integer> entry: ages.entrySet()){ // or var
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}