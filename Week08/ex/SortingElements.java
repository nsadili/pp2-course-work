

import java.util.*;

public class SortingElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(0);

        
        Collections.sort(list);
        System.out.println(list.toString());

      
        list.sort(null);
        System.out.println(list);

       
        Comparator<Integer> acomparator = new Comparator<Integer>() {
          
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, acomparator);

        AComparator comparator = new AComparator();
        Collections.sort(list, comparator);

        System.out.println(list);

    }
}

class AComparator implements Comparator<Integer> {
    
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
