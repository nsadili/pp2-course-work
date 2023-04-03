import java.util.Comparator;
// import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapsInAction<K, V> {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        ages.put("Vasila", 19);
        ages.put("LamanK", 17);
        ages.put("LamanA", 19);
        ages.put("Nuraddin", 30);
        ages.put("Tarlan", 25);

        System.out.println(ages);

        // for (var key : ages.keySet()) {
        // System.out.println(key + ":" + ages.get(key));
        // }

        // Iterator<String> it = ages.keySet().iterator();

        // while (it.hasNext()) {
        // var key = it.next();
        // System.out.println(key + ": " + ages.get(key));
        // }

        for (Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}