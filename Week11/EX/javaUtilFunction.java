import java.util.function.*;

public class javaUtilFunction {
    public static void main(String[] args){
        Supplier<String> name = () -> "islam";
        Consumer<String> print = str -> System.out.println(str);
        Function<Integer, Integer> add = n -> n+1;
        Predicate<Integer> isOdd = n -> n%2==1;

        System.out.println(name.get());
        print.accept("salam");
        System.out.println(add.apply(2));
        System.out.println(isOdd.test(3));
    }
}
