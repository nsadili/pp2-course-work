package specificproperties;

import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificProperty<T> prop){
        int c=0;
        for(var x: coll){
            if(prop.test(x)){
                c++;
            }
        }
        return c;
    }
}
