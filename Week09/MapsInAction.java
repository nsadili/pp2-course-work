import java.util.*;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Ayxan", 20);
        ages.put("Ilkin", 21);
        ages.put("Bob", 22);
        ages.put("Alim", 23);
        ages.put("Amil", 24);
        ages.put("Zaur", 25);
        ages.put("Ravan", 26);
        ages.put("Hasan", 27);
        ages.put("Nihat", 28);
        ages.put("Hazrat", 29);

        System.out.println("Enhanced for statement: ");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Iterator: ");
        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("toString() method: ");
        System.out.println(ages);

        Map<String, Integer> ages2 = new LinkedHashMap<String, Integer>();
        ages2.put("Ayxan", 20);
        ages2.put("Ilkin", 21);
        ages2.put("Bob", 22);
        ages2.put("Alim", 23);
        ages2.put("Amil", 24);
        ages2.put("Zaur", 25);
        ages2.put("Ravan", 26);
        ages2.put("Hasan", 27);
        ages2.put("Nihat", 28);
        ages2.put("Hazrat", 29);
        System.out.println("LinkedHashMap: ");
        System.out.println(ages2);
        Map<String, Integer> ages3 = new TreeMap<String, Integer>();
        ages3.put("Ayxan", 20);
        ages3.put("Ilkin", 21);
        ages3.put("Bob", 22);
        ages3.put("Alim", 23);
        ages3.put("Amil", 24);
        ages3.put("Zaur", 25);
        ages3.put("Ravan", 26);
        ages3.put("Hasan", 27);
        ages3.put("Nihat", 28);
        ages3.put("Hazrat", 29);
        System.out.println("TreeMap: ");
        System.out.println(ages3);

        Map<String, Integer> ages4 = new TreeMap<String, Integer>(Collections.reverseOrder());
        ages4.put("Ayxan", 20);
        ages4.put("Ilkin", 21);
        ages4.put("Bob", 22);
        ages4.put("Alim", 23);
        ages4.put("Amil", 24);
        ages4.put("Zaur", 25);
        ages4.put("Ravan", 26);
        ages4.put("Hasan", 27);
        ages4.put("Nihat", 28);
        ages4.put("Hazrat", 29);
        System.out.println("TreeMap in reverse order: ");
        System.out.println(ages4);

        Map<String, Integer> ages5 = new HashMap<String, Integer>();
        ages5.put("Ayxan", 20);
        ages5.put("Ilkin", 21);
        ages5.put("Bob", 22);
        ages5.put("Alim", 23);
        ages5.put("Amil", 24);
        ages5.put("Zaur", 25);
        ages5.put("Ravan", 26);
        ages5.put("Hasan", 27);
        ages5.put("Nihat", 28);
        ages5.put("Hazrat", 29);
        System.out.println("HashMap: ");
        System.out.println(ages5);
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(ages5.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println("HashMap in descending order: ");
        System.out.println(result);
    }
}


