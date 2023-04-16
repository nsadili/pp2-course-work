package ex6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {
        String [] names= { "Shamil", "Vusal", "Leyla", "Elvin","Vugar"};
        Stream<String> namesStream = Arrays.stream(names);


        Set<Integer> set= new HashSet<>(Arrays.asList(1, 4, 5, 6, 8, 9, 4, 2,3));
        Stream<Integer> numsStream= set.stream();
        
        List<Color> colors= Arrays.asList(
            new Color(255, 255, 255),
            new Color(0, 0, 0),
            new Color(127, 127, 127),
            new Color(0,0,255)
        );
        Stream<Color> colorStream= colors.stream();

       //Map<String, Integer> wordCounts= new HashMap<>();
       //System.out.println( namesStream.allMatch( s -> s.startsWith("V")));
       //System.out.println( namesStream.anyMatch( s -> s.startsWith("V")));
       //System.out.println(numsStream.count());

       
       Random randomGenerator= new Random();
       Supplier<Integer> rand= () -> randomGenerator.nextInt(10)+1;
       Stream<Integer> randomStream= Stream.generate(rand).limit(5);
       
       //randomStream.forEach(num -> System.out.println(num));

       //randomStream.forEach(System.out :: println);

       //Optional<Color> res= colorStream.findFirst();

       /*if(res.isPresent())
          System.out.println(res.get());
       else
          System.out.println("Not found anything");*/

        /*System.out.println(
            res.isPresent()
               ? res.get()
                 : "Not found anything"
          );*/

          //res.ifPresent(System.out :: println);
          /*res.ifPresentOrElse(System.out :: println, 
           () -> System.out.println("Not found anything")
          );*/
        
          /*System.out.println(
            numsStream
                    .filter(num ->  num%2!=0)
                    .count());*/

        Optional<Color> res= colorStream
          .filter(c-> c.getR()==0)
          .findFirst();
           //res.ifPresentOrElse(System.out :: println, 
           //() -> System.out.println("Not found anything")
          //);


          
            /*numsStream
               .filter(num -> num%2==0)
               .filter(num -> num>4)
               .forEach(System.out :: println);*/

            /*numsStream
               .filter(num -> num%2==0)
               .map(num -> num+1)
               .forEach(System.out :: println);*/

        Set<Integer> result = numsStream
               .filter(num -> num%2==0)
               .map(num -> num+1)
               .collect(Collectors.toSet());
               System.out.println(result);
               
          



  


      


    }
}
