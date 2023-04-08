package specproperties;



import java.util.ArrayList;

import java.util.Collection;



public class Utility {



    public static <T> int count(Collection<T> collection, Specificproperty <T> prop) {



        int c = 0;

        for (T el : collection)

            if (prop.check(el))

                c++;



        return c;

    }



    public static <T> Collection<T> filter(Collection<T> collection, Specificp__+roperty <T> prop) {



        Collection<T> filteredElements = new ArrayList<>();



        for (T el : collection)

            if (prop.check(el))

                filteredElements.add(el);



        return filteredElements;

    }



}