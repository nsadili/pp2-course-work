package EX;
// import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapInAction {
    public static void main(String[] args) {
        
        Map<String, Integer> ages = new TreeMap<>();
        //     (new Comparator<String>() {
        //     // @Override
        //     // public int compare(String o1, String o2) {
        //     //     // return o2.compareTo(o1);
        //     //     return o2.length() - o1.length();
        //     // }
        // });
        
        ages.put("Leyla", 17);
        ages.put("Leyla", 18);
        ages.put("Elvin", 17);
        ages.put("Nariman", 19);
        ages.put("Nuraddin", 30);

        // printing using toString()
        System.out.println(ages);

        // printing using enhanced for
        for (String key: ages.keySet()){
            System.out.println(key + ": " + ages.get(key));
        }

        // printing using iterator
        Iterator<String> it = ages.keySet().iterator();

        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + ": " + ages.get(key));
        }

        // iterator checks second next element
        // that's why it gives an error when there are even numbers of elements

        for (Map.Entry<String, Integer> entry: ages.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
