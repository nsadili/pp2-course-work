package Week11;

public interface AnyFunctionInt {
    void apply(String input);
    static void print(String input) {
        System.out.println(input);
    }
    default void print(String input1, String input2) {
        System.out.println(input1);
        System.out.println(input2);
    }
}