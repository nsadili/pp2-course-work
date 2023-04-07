import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;

public class Util {
    public static <T> int count(Collection<T> coll, SpecificProperties<T> sc){
        int cnt = 0;

        for(T el: coll){
            sc.hasProp(el);
            cnt++;
        }

        return cnt;
    }
}
