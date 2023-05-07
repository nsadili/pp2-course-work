import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll (nums, 1, 2, 3, 4, 6, 2, 5, 2, 6, 2, 6, 23);
        Collections.sort (nums);
       
        nums.sort(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2 ){
            return o2 - o1;
        }
    });

    System.out.println(nums);


    nums.sort(null);
    System.out.println(nums);
    
    }
}