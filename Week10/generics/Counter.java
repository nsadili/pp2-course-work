package Week10.generics;

import java.util.Collection;

public class Counter {
    public <T> int count(Collection<T> col, Property<T> prop){
        int count = 0;
        for(T i : col){
            if(prop.test(i)){
                count++;
            }
        }
        return count;
}
}
