package Week10;

import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificProperty<? super T> prop) {
        int count = 0;
        for (T el : coll) {
            if (prop.hasProp(el)) {
                count++;
            }
        }
        return count;
    }
}
