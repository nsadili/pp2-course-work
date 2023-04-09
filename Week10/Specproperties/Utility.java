package Specproperties;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {

   public static <T> int count(Collection<T> collection, SpecificProperty<T> prom){

    var cnt=0;

    for(T el: collection) {
        if(prom.check(el)) cnt++;
    }


        return cnt;
   }

   public static <T> Collection<T> filter(Collection<T> collection, SpecificProperty<T> prom){
    Collection<T> list = new ArrayList<>();
    for(T el: collection) {
        if(prom.check(el)) list.add(el);
    }

    return list;

}

}