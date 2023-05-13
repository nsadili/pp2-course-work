import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> intToString = integer -> Integer.toString(integer);
        String result = intToString.apply(42);
        System.out.println(result);
    }
}
