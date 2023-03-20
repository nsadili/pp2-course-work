import java.util.ArrayList;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1,5,2,8,9,4);
        Collections.sort(nums);

        System.out.println(nums);
        nums.sort(new DescendingOperator());
        System.out.println(nums);


    }

}

class DescendingOperator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
