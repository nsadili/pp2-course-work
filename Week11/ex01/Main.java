package Week11.ex01;

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

public class Main {
    public static void main(String[] args) {
        AFuncInt anonFuncInt = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        anonFuncInt.apply("hello");
        AFuncInt.print("world"); // since it must be static, I did not use object to access print() method
        anonFuncInt.print("hello", "world");

        AFuncInt lambdaFuncInt = input -> System.out.println(input.toLowerCase());
        lambdaFuncInt.apply("WORLD");
        AFuncInt.print("hello");
        lambdaFuncInt.print("hello", "world");
    }
}
