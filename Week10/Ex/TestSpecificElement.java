import java.util.Arrays;
import java.util.List;
import specificproperties.EvenIntegerProperty;
import specificproperties.PolindromeProperty;
import specificproperties.Util;

public class TestSpecificElement {
    public static void main(String[] args) {
      
      List<Integer> numbers= Arrays.asList(4, 2,5,6,8,3,7,9);
      int c= Util.count(numbers, new EvenIntegerProperty());
      System.out.println(c);
      
   
        
    }
}
