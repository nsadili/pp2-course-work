package Week11;

public class FunctionaIInterfaces {
    public static void main(String[] args) {
        AnyFunctionInt instance = new AnyFunctionInt() {
            @Override
            public void apply(String input) {
                System.out.println(input + input);
            }
        };
        instance.apply("string");
        AnyFunctionInt.print("string");
        instance.print("string", "string");

        AnyFunctionInt lambda = input -> System.out.println(input + input);
        lambda.apply("string");
        AnyFunctionInt.print("string");
        lambda.print("string", "string");
    }
}