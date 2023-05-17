package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        
        // Example 1: Lambda expression without parameters
        names.forEach((n) -> System.out.println("Hello!"));
        
        // Example 2: Lambda expression with a single parameter
        names.forEach(name -> System.out.println("Hello, " + name));
        
        // Example 3: Lambda expression with multiple parameters and a block of code
        names.removeIf(name -> {
            if (name.length() > 4) {
                System.out.println(name + " has more than 4 characters.");
                return true;
            }
            return false;
        });
        
        System.out.println(names); // Output: [Bob, Dave]

        Function <String, String> func = s -> new StringBuilder(s).reverse().toString();

        System.out.println(func.apply("Salam"));


        Function <Integer, Integer> func2 = n -> { int count = 0;
            while(n>0){
                count++;
                n = n / 10;

            }
            return count;
        };


        System.out.println(func2.apply(7777));


    }
}
