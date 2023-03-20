import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class SortListOfElements {
    public static void main(String[] args) {
        

        Comparator<Integer> comp = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        };
    }
}
