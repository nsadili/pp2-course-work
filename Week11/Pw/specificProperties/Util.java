package specificProperties;

import java.util.ArrayList;
import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificProperty<T> p){
        int c=0;
        for(T el : coll){
            if(p.test(el)) c++;
        }
        return c;

    }
    public static <T> Collection <T> filter(Collection<T> collection, SpecificProperty<T> prom){
        Collection <T> l= new ArrayList<>();
        for(T el : collection){
            if(prom.test(el)) l.add(el);
        }
        return l;
    }
    
}
