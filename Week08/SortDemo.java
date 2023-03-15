import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1,5,2,8,9,4);

        Collections.sort(nums);
        System.out.println(nums);

    }
    
}
