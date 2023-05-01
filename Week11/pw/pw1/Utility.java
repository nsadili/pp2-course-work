package Week11.pw.pw1;

import java.util.Collection;
import java.util.ArrayList;

public class Utility {
    public static <T> Collection<T> filter(Collection<? extends T> coll, SpecificProperty<? super T> prop) {
        ArrayList<T> arr = new ArrayList<>(coll);
        arr.removeIf(el -> !prop.test(el));
        return arr;
    }
}
