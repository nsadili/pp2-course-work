import java.util.Arrays;
import java.util.List;

import specificproperties.EvenIntegerProperty;
import specificproperties.Util;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 4, 2, 5, 6, 3, 7);

        int count = Util.count(list, new EvenIntegerProperty());
        System.out.println(count);
    }
}
