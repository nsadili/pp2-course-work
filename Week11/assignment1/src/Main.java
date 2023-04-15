public class Main {

    public static void main(String[] args) {
        AFuncInt anonFuncInt = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println("apply() method called with input parameter: " + s);
            }
        };

        anonFuncInt.apply("Anonymous Class Test");

        AFuncInt.print("Static Method Test");

        anonFuncInt.print("Default Method Test", "Second Parameter");

        AFuncInt lambdaFuncInt = (s) -> {
            System.out.println("apply() method called with input parameter: " + s);
        };

        lambdaFuncInt.apply("Lambda Expression Test");

        AFuncInt.print("Static Method Test");

        lambdaFuncInt.print("Default Method Test", "Second Parameter");
    }
}

@FunctionalInterface
interface AFuncInt {
    void apply(String s);

    static void print(String s) {
        System.out.println("Static Method Test: " + s);
    }

    default void print(String s1, String s2) {
        System.out.println("Default Method Test: " + s1 + ", " + s2);
    }
}
