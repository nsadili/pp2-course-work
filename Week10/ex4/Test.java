package Week10.ex4;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,51,22,25,125,3);
        int count = Util.count(list, new EvenIntProperty());
        System.out.println(count);
    }
}
