import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {
      System.out.println("HashMap\n");

      Map<String, Integer> ages = new HashMap<>();
		
 		ages.put("Ahmad",  10);
      ages.put("Akif",   30);
      ages.put("Zeynap", 20);
       
         for ( String s : ages.keySet()){
             System.out.println(s);
         }
        
        
         System.out.println("\nTreeMap\n");
       
         TreeMap<String, Integer> ages2 = new TreeMap<>();
	
 		ages2.put("Zeynap", 20);
 		ages2.put("Ahmad",  10);
         ages2.put("Akif",   30);
        
       
        for ( String s : ages2.keySet()){
             System.out.println(s);
         }
         System.out.println("\n\n");
        
         TreeMap<String, Integer> ages3 = new TreeMap<>(
                 Collections.reverseOrder());
                
         ages3.putAll(ages2);
        
       System.out.println(ages3.entrySet());
        }
    }