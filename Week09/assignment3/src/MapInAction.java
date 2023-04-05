import java.util.*;

public class MapInAction {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("Nurlan", 18);
        ages.put("Vasif", 17);
        ages.put("Murad", 16);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> iterator = ages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println(ages.toString());

        Map<String, Integer> hashMap = new HashMap<>(ages);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(ages);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(ages);
        System.out.println("TreeMap (non-ascending order): " + treeMap);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted HashMap (by age in descending order): " + sortedHashMap);
    }
}
