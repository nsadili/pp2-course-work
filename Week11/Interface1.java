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
 
        AFuncInt instance1 = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous Class: " + input);
            }
        };

        instance1.apply("Testing apply() method");
        AFuncInt.print("Testing static print() method");
        instance1.print("Hello", "World");

        AFuncInt instance2 = (input) -> System.out.println("Lambda Expression: " + input);

        instance2.apply("Testing apply() method");
        AFuncInt.print("Testing static print() method");
        instance2.print("Hello", "Lambda");
    }
}
