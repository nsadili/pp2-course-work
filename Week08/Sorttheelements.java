package Week08;

import java.util.*;

public class Sorttheelements {
    public static void main(String[] args){

        List<String> str=new ArrayList<>();
        str.add("Baku");
        str.add("Ordubad");
        str.add("Masazir");
        str.add("Balaken");
        
        Collections.sort(str);
        System.out.println(str);
        
        str.sort(null);
        System.out.println(str);

        str.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
            
        });
    
        System.out.println(str);

    }
}
