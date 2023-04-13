package EX1;

public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("ANONYMOUS -> " + str);
            }
            @Override
            public void print(String str1, String str2) {
                System.out.println("OVERRIDEN -> " + str1 + "; " + str2);
            }
        };

        f.apply("Hello");
        AFuncInt.print("Hello");
        f.print("Hello", "World");

        // lambda implementation
        AFuncInt lambda = str -> System.out.println("LAMBDA -> " + str);

        lambda.apply("Farewell");
        lambda.print("Farewell", "friend");
    }
}
