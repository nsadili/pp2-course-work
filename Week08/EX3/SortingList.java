package EX3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 6, 2, 5, 2, 6, 2, 6, 23);
        
        // Collections.sort(nums, new DescendingComparator());
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(nums);
    }
}

class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
