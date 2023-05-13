import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isLongEnough = str -> str.length() >= 5;
        boolean result = isLongEnough.test("Hello");
        System.out.println(result);
    }
}
