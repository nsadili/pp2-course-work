package Ex.ex4;


import java.util.Collection;
import java.util.ArrayList;


public class Utility {
    
    
    public static <T> int count(Collection<T> collection, SpecificProperty<T> prop) {



        int c = 0;

        for (T el : collection)

            if (prop.check(el))

                c++;



        return c;

    }



    public static <T> Collection<T> filter(Collection<T> collection, SpecificProperty<T> prop) {



        Collection<T> filteredElements = new ArrayList<>();



        for (T el : collection)

            if (prop.check(el))

                filteredElements.add(el);



        return filteredElements;

    }



}

