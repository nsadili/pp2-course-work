import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingList{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        Collections.addAll(nums, 1,2,3,4,5,6,7,8,9,0);
        //Collections.sort(nums); // from little to big

        //Comparator
        //Collections.sort(nums, new DescendingComparator());

        Collections.sort(nums, new Comparator<integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(nums);
    }
}

class DescendingComparator implements Comparator<Integer>{
    
    @Override
    public int compare(Integer o1, Integer o2) {
        //return o - o2;
        return o2.compareTo(o1);
    }
}