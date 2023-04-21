package Week11;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        AfuncInt instance = (AfuncInt) new AfuncInt() {
            @Override
            public void apply(String input) {
                System.out.println(input + input);
            }
        };
        instance.apply("string");
        AfuncInt.print("string");
        instance.print("string", "string");

        AfuncInt lambda = input -> System.out.println(input + input);
        lambda.apply("string");
        AfuncInt.print("string");
        lambda.print("string", "string");
    }
}