package specificproperties;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,6,6);
        List<String> list1 = Arrays.asList("bob", "anana", "hello");
        int count = Util.count(list, new EvenIntegerProperty());
        int count1 = Util.count(list1, new PalindromeProperty());
        System.out.println(count);
        System.out.println(count1);
    }   
}
