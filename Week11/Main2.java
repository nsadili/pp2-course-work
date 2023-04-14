import java.lang.reflect.Array;
import java.util .*;
import java.util .stream.*;

class Main 
{
    public static void main(String args[]) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        List<Integer> square = number.stream(). map(x -> x * x);
             collect(Collectors.toList());

             System.out.println(square);s

        List<String> names =
        Array.asList("Reflection, Collection, Stream, Sabah");

        List<String> result = names.stream(). filter(s ->s.startsWith("S")).
         collect(Collectors.toList());

         System.out.println(result);

         List<String> show =
         names.stream(). sorted(). collect(Collectors.toList());

         System.out.println(show);

         List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        
        }

    private static void collect(Collector<Object, ?, List<Object>> list) {
    }
}