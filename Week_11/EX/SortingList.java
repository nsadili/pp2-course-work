package Week08.EX;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2 ,7 ,4 ,10 ,6 ,15, 8);

        Collections.sort(nums, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1 , Integer o2){
                return o2.compareTo(1);
            }

        });

        
    }

    class DescendingComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1 , Integer o2){
            return o2.compareTo(1);

        }


    }
    
}
