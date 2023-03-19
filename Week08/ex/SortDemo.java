import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1,3,4,5,7,9);

        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer A1, Integer A2) {
               return A2-A1;
            }
            });


        System.out.println(nums);

    }
    
}

class DescendingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer A1, Integer A2) {
       return A2 - A1;
    }
    
}
