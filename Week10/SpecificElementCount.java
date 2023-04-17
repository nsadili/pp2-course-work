package Week10;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SpecificElementCount {
    static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }

    public interface UnaryPredicate<T> {
        public boolean test(T obj);
    }
    
    static <T> int palindromeStrings(Collection<T> c){
     int cnt=0;
     for(T el: c)
     if(reverseTest(el)) cnt++;
      
     return cnt;

    }
    public boolean reverseTest(String obj){
        StringBuilder reverse= new StringBuilder();

        for(int i=obj.length()-1; i>=0; i--){
            reverse.append(obj.charAt(i));
        }
        return obj.equals(reverse.toString());
    }

    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("hello", "world", "level", "deed", "radar");
        System.out.println(palindromeStrings(c));

    }
}
