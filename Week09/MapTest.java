import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> ages=new HashMap<String,Integer>();

        ages.put("Ulvi", 18);
        ages.put("Tima", 17);
        ages.put("Rafa", 19);

        for(String a: ages.keySet()) {
            System.out.println(a);
        }

        Iterator it=ages.keySet().iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(ages.keySet().toString());
    }
}
