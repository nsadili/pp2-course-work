

public class FunctionalInterfaces {
    public static void main(String[] args) {
        AFuncInt instance = new AFuncInt() {
   
            public void apply(String input) {
                System.out.println(input + input);
            }
        };
        instance.apply("string");
        AFuncInt.print("string");
        instance.print("string", "string");

        AFuncInt lambda = input -> System.out.println(input + input);
        lambda.apply("string");
        AFuncInt.print("string");
        lambda.print("string", "string");
    }
}