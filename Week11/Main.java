package Week11;

public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt() {
            @Override
            public void apply(String str) {

                System.out.println("Anonymous -> " + str);
            }

            @Override
            public void print(String str1, String str2) {
                System.out.println("Overridden ==>" + str1 + " " + str2);
            }
        };

        // f.apply("PP2");
        // AFuncInt.print("PP2");
        // f.print("PP1", "PP2");

        AFuncInt lambda = str -> System.out.println("Lambde -> " + str);;
        lambda.apply("Hello");

        lambda.print("Hello", "World");
    }
}
