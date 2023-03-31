package sortlist;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("coffee");
        list.add("tea");
        list.add("bread");
        list.add("butter");
        list.add("eggs");
        Collections.sort(list);
        // List.sort(list);
        System.out.println(list.toString());
    }
}
