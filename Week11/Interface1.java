@FunctionalInterface
interface AFuncInt {
    void apply(String input);

    static void print(String input) {
        System.out.println(input);
    }

    default void print(String input1, String input2) {
        System.out.println(input1 + " " + input2);
    }
}

public class Interface1 {
    public static void main(String[] args) {
        // Creating an instance of type AFuncInt using anonymous classes
        AFuncInt instance1 = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous Class: " + input);
            }
        };

        // Calling the three methods of the first instance
        instance1.apply("Testing apply() method");
        AFuncInt.print("Testing static print() method");
        instance1.print("Hello", "World");

        // Creating another instance using lambda expressions
        AFuncInt instance2 = (input) -> System.out.println("Lambda Expression: " + input);

        // Calling the three methods of the second instance
        instance2.apply("Testing apply() method");
        AFuncInt.print("Testing static print() method");
        instance2.print("Hello", "Lambda");

        // Expected output:
        // Anonymous Class: Testing apply() method
        // Testing static print() method
        // Hello World
        // Lambda Expression: Testing apply() method
        // Testing static print() method
        // Hello Lambda
    }
}
