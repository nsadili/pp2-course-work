import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class SortingList {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 2,4,5,7,20,1,0,2,34);
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                return b.compareTo(a);  
            }
        });
        System.out.println(nums);
        
    }
}

class DescendingComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return a.compareTo(b);  
    }
}
