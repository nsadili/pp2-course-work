import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortListOfElements {
    public static void main(String[] args) {
        List<String> ab = new ArrayList<>();
        ab.add("a");
        ab.add("d");
        ab.add("c");
        ab.add("b");
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        };
        Collections.sort(ab, comp);

        System.out.println(ab);
    }
}
