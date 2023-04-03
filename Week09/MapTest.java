import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> ages=new HashMap<String,Integer>();

        ages.put("Ulvi", 18);
        ages.put("Tima", 17);
        ages.put("Rafa", 19);

        for(String key: ages.keySet()) {
            System.out.println(key+"="+ages.get(key)+" ");
        }
        
        Iterator<String> it=ages.keySet().iterator();

        while(it.hasNext()) {
            String key=it.next();
            System.out.println(key+"="+ages.get(key));
        }

        System.out.println(ages.toString());
    }
}
