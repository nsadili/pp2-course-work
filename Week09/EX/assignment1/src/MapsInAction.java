import java.util.*;

public class MapsInAction {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Murad", 25);
        ages.put("Teymur", 30);
        ages.put("Seymur", 20);
        ages.put("Javidan", 35);

        System.out.println("Keys and values using enhanced for statement:");
        for (String key : ages.keySet()) {
            System.out.printf("%s: %d\n", key, ages.get(key));
        }

        System.out.println("\nKeys and values using iterator:");
        Iterator<String> itr = ages.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.printf("%s: %d\n", key, ages.get(key));
        }

        System.out.println("\nKeys and values using toString() method:");
        System.out.println(ages.toString());

        Map<String, Integer> agesLinked = new LinkedHashMap<String, Integer>();
        agesLinked.put("Murad", 25);
        agesLinked.put("Teymur", 30);
        agesLinked.put("Seymur", 20);
        agesLinked.put("Javidan", 35);

        System.out.println("\nKeys and values using toString() method for LinkedHashMap:");
        System.out.println(agesLinked.toString());

        Map<String, Integer> agesTree = new TreeMap<String, Integer>(Collections.reverseOrder());
        agesTree.put("Murad", 25);
        agesTree.put("Teymur", 30);
        agesTree.put("Seymur", 20);
        agesTree.put("Javidan", 35);

        System.out.println(
                "\nKeys and values using toString() method for TreeMap with non-ascending alphabetical order:");
        System.out.println(agesTree.toString());

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(ages.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedAges = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedAges.put(entry.getKey(), entry.getValue());
        }

        System.out.println("\nHashMap entries sorted by descending order of the ages (values):");
        System.out.println(sortedAges.toString());
    }
}