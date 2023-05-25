package Week09.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Zaur", 18);
        ages.put("Vasya", 20);
        ages.put("Jack", 26);
        ages.put("Voldemort", 71);

        // Part i

        // 1. Enhanced for loop
        System.out.println("Keys (enhanced for):");
        for (String key : ages.keySet()) System.out.println(key);
        System.out.println();

        // 2. Iterator
        System.out.println("Keys (iterator):");
        Iterator<String> it = ages.keySet().iterator();
        while (it.hasNext()) System.out.println(it.next());
        System.out.println();
        
        // 3. toString()
        System.out.println(ages.toString() + "\n");

        // Part ii
        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Zaur", 18);
        lhm.put("Vasya", 20);
        lhm.put("Jack", 26);
        lhm.put("Voldemort", 71);

        Map<String, Integer> tm = new TreeMap<>(lhm);
        System.out.println(ages);
        System.out.println(lhm);
        System.out.println(tm);
        System.out.println();

        // Part iii
        Map<String, Integer> desc = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        desc.putAll(tm);
        System.out.println(desc);
    }
}
