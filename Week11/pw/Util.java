import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Util{
    public static <T> List<T> filter(Collection<T> coll, SpecificProperty<T> p){
        List<T> newColl = new ArrayList<>();
        for(T x: coll){
            if(p.test(x)) newColl.add(x);
        }
        return newColl;
    }
}