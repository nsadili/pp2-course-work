import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[]args){

        HashMap<String,Integer> ages= new HashMap<String,Integer>();
        ages.put("Cavid", 17);
        ages.put("Nihat", 20);
        ages.put("Cavan", 16);

        //1.System.out.print(ages);



        // 2. Iterator<Map.Entry<String,Integer>> itr= ages.entrySet().iterator();
        // System.out.print(itr);
        
        // while(itr.hasNext()) {
        //     Map.Entry<String, Integer> entry = itr.next();
        //     String key = entry.getKey();
        //     Integer value = entry.getValue();
        //     System.out.println(key + " = " + value);
        // }

        
       System.out.print(ages.toString());


    }       


}
