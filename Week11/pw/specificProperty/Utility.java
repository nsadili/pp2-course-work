package specificProperty;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {
    public static <T> int count(Collection<T> collection, SpecificProperty<T> prop) {

        int c = 0;
        for (T el : collection)
            if (prop.check(el))
                c++;

        return c;
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {

        Collection <T> filteredElement = new ArrayList<>();
        for (T el : c)
            if (p.check(el))
                filteredElement.add(el);

        return filteredElement;
    }
}