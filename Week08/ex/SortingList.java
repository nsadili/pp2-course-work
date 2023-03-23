package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 5, 5, 7, 12, 3, 9);
        // Collections.sort(nums,new DescendingComperator());
        Collections.sort(nums, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                // return o1-o2; //defoult behavior for int
                return o2.compareTo(o1);

            }
        });
        System.out.println(nums);

    }

}

class DescendingComperator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // return o1-o2; //defoult behavior for int
        return o2.compareTo(o1);

    }

}
