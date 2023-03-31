package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMaps {
    public static void main(String[] args) {
        Map<String, List<String>> friendsMap = new HashMap<>();

        List<String> list = new ArrayList<>();
        list.add("Turkana");
        list.add("Vidadi");
        list.add("Aliya");
        list.add("Arzu");
        friendsMap.put("Naik", list);
        System.out.println(friendsMap);
    }

}
