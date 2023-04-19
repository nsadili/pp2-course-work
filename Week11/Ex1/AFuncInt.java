// 1. Create a functional interface AFuncInt
@FunctionalInterface
interface AFuncInt {
    // i. An abstract apply() method
    void apply(String input);

    // ii. a static method print()
    static void print(String input) {
        System.out.println(input);
    }

    // iii. a default method print()
    default void print(String input1, String input2) {
        System.out.println(input1 + " " + input2);
    }
}