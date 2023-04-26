import java.util.*;
import java.util.function.Supplier;
public class JavaUtilFunction {
    public static void main(String[] args) {
        // Costumer -> void
        // Function -> result
        // Predicate -> boolean
        // Supplier -> Taking nothing Returns result (Returning random number etc.)

        Random ram = new Random();

        Supplier<Integer> random = () -> new ram.nextInt(10);

        System.out.println(random.get());
    }
}
