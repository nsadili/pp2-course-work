
import java.util.Map;
import java.util.TreeMap;

public class MapsInAction {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        ages.put("Shamil", 19);
        ages.put("Laman", 17);
        ages.put("LamanA", 19);
        ages.put("Nuraddin", 16);

        System.out.println("values: ");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
