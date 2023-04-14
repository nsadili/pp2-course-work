import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo{
    public static void main(String[] args) {
        Consumer<String> c1 = str ->System.out.println(str);
        Consumer<String> c2 = str -> System.out.println(str.toUpperCase());
        System.out.println("CONSUMER");
        c1.accept("Hello");
        c2.accept("hello");

        System.out.println("FUNCTION");
        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, Integer> length = str -> str==null ? 0 : str.length();
        System.out.println(toUpper.apply("hello"));
        System.out.println("LENGTH: "+ length.apply(null));

        System.out.println("PREDICATE");
        Predicate<Integer> isOdd = n-> n%2 !=0;
        // System.out.println(isOdd.(10));


        Supplier<Integer> rand = () -> new Random().nextInt(10)+1;
        double avg=0;
        for(int i=0;i<1000;i++){
            avg+=rand.get();
            System.out.println(avg);
        }

        avg/=1000;
        System.out.println(avg);
    }
}