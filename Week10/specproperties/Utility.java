package specproperties;

import java.util.Collection;

public class Utility  {


    public static<T> int count(Collection<T> collection, SpecificProperty<T> prop){
        int c = 0;
        for(T el: collection){
           if(prop.check(el))
               c++;
        }
        return c;
    }
}
