import java.util.Optional;

@FunctionalInterface
interface AFuncInt {
    void apply(String input);

    static void print(String input) {
        System.out.println("Static print method: " + input);
    }

    default void print(String input1, String input2) {
        System.out.println("Default print method: " + input1 + ", " + input2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of AFuncInt using anonymous class
        AFuncInt obj1 = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous class apply method: " + input);
            }
        };

        // Testing the methods of obj1
        obj1.apply("test");
        AFuncInt.print("test1");
        obj1.print("test2", "test3");

        // Creating an instance of AFuncInt using lambda expression
        AFuncInt obj2 = (input) -> System.out.println("Lambda apply method: " + input);

        // Testing the methods of obj2
        obj2.apply("test");
        AFuncInt.print("test1");
        obj2.print("test2", "test3");

        // Optional class example
        String str = "Hello";
        Optional<String> optionalStr = Optional.of(str);
        optionalStr.ifPresent(System.out::println);
    }
}
