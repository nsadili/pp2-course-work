package specProperties;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<String> list = Arrays.asList("level", "tier", "class", "madam");

        Collection<String> palindroms = Utility.specCollection(list, new PalindromeProperty());
        int count = Utility.count(numbers,new EvenIntegerProperty());


        System.out.println(palindroms);
        System.out.println(count);
    }

    
    
}
