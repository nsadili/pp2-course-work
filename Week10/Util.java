package Week10;

import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificElementCount<T> prop ) {
        int c = 0 ;
        for(T el : coll){
            if(prop.hasProp(el)) c++;

        }

        return c ;
    }

    
}
