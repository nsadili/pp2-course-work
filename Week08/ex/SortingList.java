import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//package Week08.ex;

public class SortingList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 6, 2, 5, 2, 6, 2, 6, 23);

        Collections.sort(nums);
        System.out.println(nums);

    }
}
