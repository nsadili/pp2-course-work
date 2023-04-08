package specificproperties;

import java.util.ArrayList;
import java.util.Collection;

public class Util {

    
    public static <T> int count(Collection<T> coll, SpecificProperty<T> prop) {
        int c = 0; 
        for(T el : coll) 
            if(prop.test(el))
                c++;

        return c; 
    }

    public static <T> Collection<T> Filter(Collection<T> coll, SpecificProperty<T> prop) {
        
    Collection<T> filteredElements = new ArrayList<>();
        
        for(T el : coll) 
            if(prop.test(el))
                filteredElements.add(el);

        return filteredElements; 
    }

}
