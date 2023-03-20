package Week08.EX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 17,27,12,22);

         //Collections.sort(nums); 
         nums.sort(new DescendingComparator());


        System.out.println(nums);

    }
    
}

class DescendingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {

       return o2 - o1;
    }
    
}
    

