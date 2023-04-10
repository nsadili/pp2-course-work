package ex04;

import java.util.Collection;

public class Util {
    
    public static <T> int count(Collection<T> collection, SpecificProperty<T> property) {

        int c = 0;

        for (T obj : collection)

        if (property.check(obj))

        c++;
        
        return c;

    }
}
