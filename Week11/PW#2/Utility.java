package SpecificProperty;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {
    public static Collection<Object> filter(Collection<Object> c, SpecificProperty p) {
        Collection<Object> result = new ArrayList<>();

        for (Object obj : c) {
            if (p.hasProperty(obj)) {
                result.add(obj);
            }
        }

        return result;
    }
}
