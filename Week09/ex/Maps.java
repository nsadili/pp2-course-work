import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

  public class Maps{
    public static void main(String[] args) {
        
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        ages.put("Vusat", 21);
        ages.put("Vasila", 18);
        ages.put("Nuraddin", 30);
        ages.put("Narmina", 18);
        ages.put("Vusat", 22); // updates
        ages.put("Naik", 19);


        System.out.println(ages);

       // for(var key : ages.keySet()){
            //System.out.println(key + " -> " + ages.get(key));
        //}

       // Iterator<String> it = ages.keySet().iterator();
        //while (it.hasNext()) {
          //  var key = it.next();
           // System.out.println(key + " -> " + ages.get(key));
       /// }

       for(var entry : ages.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
       }
    }
}