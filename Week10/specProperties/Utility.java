package specProperties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Utility {
    public static <T> int count(Collection<T> collection, SpecificProperty<T> prop){
        
        int count = 0;
        for(T el:collection){
             if(prop.check(el) == true){
                 count++;
             }
        }
        return count;

        // Iterator<T> it = collection.iterator();

        // while(it.hasNext()){
        //     if(prop.check(it.next()) == true){
        //         count++;
        //     }
        // }
        // return count;
    }

    public static <T> Collection<T> specCollection(Collection<T> collection, SpecificProperty<T> prop){
        Collection<T> arr = new ArrayList<>();

        // Iterator<T> it = collection.iterator();

        // while(it.hasNext()){
        //     T el = it.next();
        //     if(prop.check(el) == true){
        //         arr.add(el);
        //     }
        // }

        // return arr;

        for(T el:collection){
             if(prop.check(el) == true){
                arr.add(el);
             }
        }
        return arr;
    }
}
