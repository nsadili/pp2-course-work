import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Filter {
    
    public static <T> Collection<T> filter(Collection<T> c, SpecProp<T> p) {
        List<T> result = new ArrayList<T>();
        for (T element : c) {
            if (p.check(element)) {
                result.add(element);
            }
        }
        return result;
    }
    
}
