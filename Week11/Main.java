package week11;

import java.util.Optional;

interface AFuncInt {

    void apply(String input);

    static void print(String input) {
        System.out.println(input);
    }

    default void print(String input1, String input2) {
        System.out.println(input1 + " " + input2);
    }
}

public class Main {
    public static void main(String[] args) {
        AFuncInt instance1 = input -> System.out.println("Applying input: " + input);
        instance1.apply("ts");
        AFuncInt.print("ts");
        instance1.print("ts1", "ts2");

        AFuncInt instance2 = (input) -> System.out.println("Applying input: " + input);
        instance2.apply("ts");
        AFuncInt.print("ts");
        instance2.print("ts", "ts");

        Optional<String> optionalValue;
        System.out.println(false);

        optionalValue = Optional.of("ts");
        System.out.println(true);
        System.out.println(optionalValue.get());
    }

}
