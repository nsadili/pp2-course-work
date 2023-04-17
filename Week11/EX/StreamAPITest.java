
import java.util.Arrays;

public class StreamAPITest {
    public static void main(String[] args){
        Integer[] numbers = {93, 17, 22, 74, 61, 45, 38, 81, 52, 10};

        System.out.println("AllMatch: "+ Arrays.stream(numbers).allMatch(n -> n%2==1));
        System.out.println("Count: "+ Arrays.stream(numbers).count());
        System.out.println("Limit: "+ Arrays.stream(numbers).limit(3));
        Arrays.stream(numbers).forEach(n -> System.out.println("for:"+ n));
        System.out.println("First: "+ Arrays.stream(numbers).findFirst());
        System.out.println("Filter: "+ Arrays.stream(numbers).filter(n -> n%2==0));
        System.out.println("Sorted: "+ Arrays.stream(numbers).sorted());
        System.out.println("Collect: "+ Arrays.stream(numbers).map(n -> n+10));
    }
}
