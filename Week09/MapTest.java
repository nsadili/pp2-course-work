import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;


public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> ages=new TreeMap<String,Integer>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o2.compareTo(o1);
            }

        });

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
