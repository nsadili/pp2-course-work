package Week10.ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 2, 0, 7, 12, 6, 4, 3, 1, 11);
        System.out.println(count(ints, new EvenIntegerProperty()));
    }

    public static <T> int count(Collection<? extends T> coll, SpecificProperty<? super T> prop) {
        int res = 0;
        for (T el : coll) if (prop.hasProperty(el)) res++;
        return res;
    }
}
