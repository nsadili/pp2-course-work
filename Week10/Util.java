package Week10;

import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificProperty<?> prop) {
        int c=0;
        for(T el : coll)
        if(prop.test(el))
        c++;
            //  prop.hasProp(el);
        return c;

    }
}
