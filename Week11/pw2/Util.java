package pw2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Util {
    
    public static <T> List<T> count(Collection<T> coll,SpecificProperty<T> prop ) {
        List<T> l=new ArrayList<T>();

        for(T el: coll) {
            if(prop.test(el)) l.add(el);
        }

        return l;
    }
}
