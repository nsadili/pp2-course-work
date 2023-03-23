package pp2.week08;
import java.util.*;
public class DistinctWords {
    public static void main (String [] args){
        SortedSet<String> names = new TreeSet<>();
        names.add("Ayla");
        names.add("Khavar");
        names.add("Emil");
        names.add("Maryam");
        names.add("Ayla");
        System.out.println(names);
    }
}
