package Week11.ex4;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<String> c1 =  str -> System.out.println("Consumed" + str);
        Consumer<String> c2 = str -> {
            String newString = str.toLowerCase();
            System.out.println(newString);
        };

        c1.accept("Hello");
        c2.accept("Hello");

        Function<String, Integer> funcLen = str -> str.length();

        System.out.println(funcLen.apply("smth"));

        Predicate<Integer> evenLambda = n -> n % 2 == 0;
        Predicate<String> validWordLambda = s -> s != null && s.length() > 3;

        System.out.println(evenLambda.test(5));
        System.out.println(validWordLambda.test("smth"));

        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(10) + 1;

        for(int i = 0; i < 10; i++) {
            System.out.println(randomIntSupplier.get());
        }
    }
}
 