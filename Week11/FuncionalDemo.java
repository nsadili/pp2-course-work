import java.util.Random;
import java.util.function.*;

public class FuncionalDemo {
    public static void main(String[] args) {
        Consumer<String> cosumer = (str)->System.out.println(str.toUpperCase());
        Function<String, Integer> lengthLambda= str->str!=null?str.length():0;
        System.out.println(lengthLambda.apply("Hello"));
        Predicate<Integer> isEven=n->n%2==0;
        System.out.println(isEven.test(5));
        Predicate<Character> isUpper =ch->Character.isUpperCase(ch);
        System.out.println(isUpper.test('A'));
        System.out.println(isUpper.test('a'));
        final Random ranGen = new Random();
        Supplier<Integer> supplier=() -> new Random().nextInt(6)+1;
        for(int i=0;i<1000;i++)
            System.out.println(supplier.get()+" ");
    }
}
