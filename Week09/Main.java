package Week09;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Ilaha Jamalli", 19);
        map.put("Nihat Ahmadli", 20);
        map.put("Inji Sadigli", 17);

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + map.get(key));
        }
    }
}
