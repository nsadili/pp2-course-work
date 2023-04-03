package Week08.classwork;
import java.util.Comparator;

public class SortList {
    
}

class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
    // return 01 - 02; //default behavior for integers
    return o1.compareTo(02);
    }
}