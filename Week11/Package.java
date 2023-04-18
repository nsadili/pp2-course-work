package Week11;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Package {
    public static void main(String[] args) {
         // Consumer: prints a string
         Consumer<String> printConsumer = str -> System.out.println(str);
         printConsumer.accept("Hello, world!"); // output: Hello, world!
         
         // Function: adds 1 to an integer
         Function<Integer, Integer> addOne = num -> num + 1;
         int result = addOne.apply(5);
         System.out.println(result); // output: 6
         
         // Predicate: checks if an integer is greater than 10
         Predicate<Integer> isGreaterThanTen = num -> num > 10;
         boolean isGreaterThanTenResult = isGreaterThanTen.test(15);
         System.out.println(isGreaterThanTenResult); // output: true
         
         // Supplier: returns a random integer
         Supplier<Integer> randomInteger = () -> (int) (Math.random() * 100);
         int randomIntegerResult = randomInteger.get();
         System.out.println(randomIntegerResult); // output: a random integer between 0 and 100

    }
    
}
