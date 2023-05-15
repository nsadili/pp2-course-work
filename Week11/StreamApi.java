package Week11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args ){
    List<Integer> integer = Arrays.asList(2, 4, 5 ,6 ,7 ,3, 6, 3, 6 ,3 ,6 ,21, 92, 6, 4);
    List<Integer> counter = integer.stream().filter( n -> n!=0 ).collect(Collectors.toList());
    System.out.println("New list: " + counter + " length: " + counter.size());
    }
    
}