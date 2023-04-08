import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o2.compareTo(o1);
                return o2.length()-o1.length();
            }
        });
        ages.put("Vusat", 21);
        ages.put("Victor", 34);
        ages.put("Fred", 33);
        ages.put("Mark", 55);
        ages.put("Vusat", 22);
        ages.put("Richard", 18);

        /*
         * System.out.println(ages);
         * for(var key:ages.keySet()){
         * System.out.println(key+"->"+ages.get(key));
         * }
         */
        /*
         * Iterator<String> it = ages.keySet().iterator();
         * while (it.hasNext()) {
         * var key = it.next();
         * System.out.println(it.next() + "-->" + ages.get(it.next()));
         * }
         */
        for (var entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}