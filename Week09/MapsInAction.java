import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.*;



public class MapsInAction
{
    public static void main(String[] args)
    {
        //Map<String, Integer> ages = new LinkedHashMap<>();
        //Map<String, Integer> ages = new TreeMap<>();
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                //return o2.compareTo(o1);
                return o2.length() - o1.length();
            }
        });

        ages.put("Sara", 19);
        ages.put("Kamal", 13);
        ages.put("Mammadaga", 50);
        ages.put("Rovshan", 23);
        ages.put("Sara", 20);
        ages.put("Tarana", 49);
        

        System.out.println(ages);

        // for(var key : ages.keySet())
        // {
        //     System.out.println(key + " -> " + ages.get(key));
        // }

        // Iterator<String> it = ages.keySet().iterator();
        // while (it.hasNext())
        // {
        //     var key = it.next();
        //     System.out.println(key + " -> " + ages.get(key));
        // }

        for (Entry<String, Integer> entry : ages.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }
}