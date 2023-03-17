import java.util.List;

import javax.xml.transform.Source;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        Collections.addAll(nums, 1,2,3,4,5,6,7,8,9,0);
        Collections.sort(nums); // from little to big
        System.out.println(nums);
    }
}
