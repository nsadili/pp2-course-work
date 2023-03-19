import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 5);

        // Collections.sort(nums);
        // nums.sort(new DescendingComparator());

        nums.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

        });
        System.out.println(nums);

    }
}

class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o2 - o1;

    }

}