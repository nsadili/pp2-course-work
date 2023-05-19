import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface SpecificProperty<T> {
    boolean check(T element);

    static <T> List<T> filter(Collection<T> collection, SpecificProperty<T> property) {
        List<T> result = new ArrayList<>();
        for (T element : collection) {
            if (property.check(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
