import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println("Programming " + s);
        consumer.accept("HomeWork");

        Function<Integer, Integer> function = i -> i * i;
        Integer result = function.apply(5);
        System.out.println("Result: " + result);

        Predicate<String> predicate = s -> s.length() > 5;
        boolean testResult = predicate.test("Programming HomeWork");
        System.out.println("Test Result: " + testResult);

        Supplier<String> supplier = () -> "Programming HomeWork";
        String supplyResult = supplier.get();
        System.out.println("Supply Result: " + supplyResult);
    }

}
