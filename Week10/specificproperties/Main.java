package specificproperties;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,6,6);
        int count = Util.count(list, new EvenIntegerProperty());
        System.out.println(count);
    }   
}
