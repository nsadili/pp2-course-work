import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 5, 8, 2, 9, 4);

        System.out.println(nums);
   
        Collections.sort(nums);

        System.out.println(nums);

        System.out.println();
        System.out.println();
        
        nums.sort(new DescendingComparator());

        System.out.println(nums);

    }
}

class DescendingComparator implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
