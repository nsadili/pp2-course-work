import java.util.function.Consumer;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        /*Consumer<String> c1= str -> System.out.println("Consumed " +str);
        
        Consumer<String> c2= str -> {
            String newOne=str.toLowerCase();
                        System.out.println(newOne);
                    };
    
        c1.accept("Hello");
        c2.accept("First Letters Used To Be Upper Case");*/

        Function<String,Integer> function = str-> str== null?0:str.length();
        Function<String,Integer> function2 = str-> {
            //if(str==null) throw new IllegalArgumentException();
            int res= str.length();
            return res;
        };

        function.apply("Hello");
        function2.apply("Hello");
        
        function.apply(null);
        function2.apply(null);

    }
    
}
