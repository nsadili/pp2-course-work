import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPackage {
    public static void main(String[] args) {
        Consumer<String> c1 = (str) -> System.out.println("Consumed: " + str);

        Consumer<String> c2 = str -> {
            String newOne = str.toLowerCase();
            System.out.println(newOne);
        };

        c1.accept("Hello");
        c2.accept("Hey there");

        Function<String, Integer> funcLen = (str) -> (str == null ? 0 : str.length());

        Function<String, Integer> funcLen2 = (str) -> {
            if (str == null)
                throw new IllegalArgumentException();
            int res = str.length();
            return res;
        };

        System.out.println(funcLen.apply("Nuraddin"));
        System.out.println(funcLen2.apply("Nuraddin"));

        System.out.println(funcLen.apply(null));
        System.out.println(funcLen2.apply(null));

        // Predicate<Integer> evenLambda = n -> n % 2 == 0;

        Predicate<String> validWordLambda = s -> s != null && s.length() > 3;

        System.out.println(validWordLambda.test("abc"));
        System.out.println(validWordLambda.test("ab"));
        System.out.println(validWordLambda.test(null));
        System.out.println(validWordLambda.test("Programming"));

        Supplier<Integer> randomINtSupplier = () -> new Random().nextInt(10) + 1;
        for (int i = 0; i < 10; i++)
            System.out.println(randomINtSupplier.get()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              );
    }
}