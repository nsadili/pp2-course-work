import java.util.*;


public class MapsInAction {
    public static void main(String[] args) throws Exception {

        Map <String, Integer> ages = new HashMap<>();   
        ages.put("Fuad", 17);
        ages.put("Fuad2", 18);
        ages.put("Fuad3", 19);
        ages.put("Fuad4", 20);

        //1
        System.out.println(ages.toString());

        //2
        for(String key : ages.keySet()){
            System.out.println(key + "=" +ages.get(key));
        }
        
    }
    
}
