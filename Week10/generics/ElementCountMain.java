package Week10.generics;

import java.util.Arrays;
import java.util.Collection;

public class ElementCountMain {
    public static void main(String[] args) {
        Collection<Integer> ints = Arrays.asList(12, 14, 17, 20, 25);
        Collection<String> strs = Arrays.asList("Apple", "Anna", "Bob", "Alice");
        Counter counter = new Counter();
        int count = counter.count(ints, new EvenProperty());
        System.out.println(count);

        int count2 = counter.count(strs, new PalindromeProperty());
        System.out.println(count2);
    }
}
