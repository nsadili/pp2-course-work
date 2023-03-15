import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        Collections.addAll(nums, 1,9,6,2,9,2,0);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
