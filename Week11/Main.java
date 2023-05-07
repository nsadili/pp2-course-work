// Define the functional interface AFuncInt
@FunctionalInterface
interface AFuncInt {
    // Abstract method that takes a String parameter and returns void
    void apply(String s);

    // Static method that takes a String parameter and prints it
    static void print(String s) {
        System.out.println(s);
    }

    // Default method that takes two String parameters and prints both
    default void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of AFuncInt using an anonymous class
        AFuncInt anonObj = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println("Anonymous apply method: " + s);
            }
        };

        // Call the methods of the anonymous object
        anonObj.apply("Hello");
        AFuncInt.print("World");
        anonObj.print("Hello", "World");

        // Create another instance of AFuncInt using a lambda expression
        AFuncInt lambdaObj = (s) -> System.out.println("Lambda apply method: " + s);

        // Call the methods of the lambda object
        lambdaObj.apply("Hello");
        AFuncInt.print("Lambda");
        lambdaObj.print("Hello", "Lambda");
    }
}
