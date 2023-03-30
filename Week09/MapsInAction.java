package Week09;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsInAction {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Naik Pashayev", 18);
        map.put("Vidadi Nabiyev", 17);
        map.put("Elchin Pashayev", 45);

        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()) System.out.println(map.get(itr.next()));
        
        System.out.println(map.toString());
    }
}
