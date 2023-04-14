package Week11;

import java.util.HashMap;
import java.util.Set;

public class MainPract {
    public static void main(String[] args) {
       
        PractFuncInt a1 = new PractFuncInt() {
          @Override
          public void apply(String input) {
            System.out.println("apply method called with input: " + input);
          }
        };

        PractFuncInt a2 = (s)-> System.out.println("apply method called with input: " + s);



    
        a1.apply("hello");
        a2.apply("world");


}

}
