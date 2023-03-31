package ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingInCustomerOrder {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Leyla", 28);
        ages.put("Elvin", 17);
        ages.put("Nuraddin", 30);
        ages.put("Laman", 18);
        ages.put("Laman", 20);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(ages.entrySet());
        Comparator<Map.Entry<String, Integer>> com = new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        Collections.sort(entryList,com);
        System.out.println(entryList);
    }

}