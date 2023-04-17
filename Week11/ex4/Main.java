package Week11.ex4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        Consumer<String> c1= str-> System.out.println("Consumed: "+str);

        Consumer<String>  c2= str-> {
            String newOne= str.toLowerCase();
            System.out.println();
        };

        Function<String, Integer> funcLen=(str)-> (str== null ? 0: str.length());
        Function<String, Integer> funcLen1=str->{
            if(str==null) throw new IllegalArgumentException();
            int res= str.length();
            return res;
        };

        //System.out.println(funcLen.apply("name"));
       // System.

       Predicate<Integer> evenLambda=n->n%2==0;
       Predicate<String> validWordLambda=s-> s!=null && s.length()>3;

       //System.out.println(validWordLambda.test("hb"));
      // System.out.println(validWordLambda.test("sxdfcgvhbj"));
       //System.out.println(validWordLambda.test(null));

      static Random randomGenerator= new Random();
       Supplier<Integer> randomIntSupplier=()-> Random().nextInt(10) + 1;

        double avg;

        for(int i=0; i<10;i++) 
          avg+= randomIntSupplier.get();

        avg=avg/100;
      
    }

} 