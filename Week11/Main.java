package Week11;
import java.util.function.*;
public class Main {
    public static void main() {
        Consumer<String> a = string -> System.out.println();;
        a.accept("Hii!");
        Function<Integer, Integer> printer = argument -> {
            return argument * 2;
        };

    }
     
}
