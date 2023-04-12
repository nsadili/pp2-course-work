package ex1;

public class Main {
    public static void main(String[] args) {

        AFuncInt f = new AFuncInt() {

            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }

            @Override
            public void print(String str1, String str2) {
                System.out.println("Overriden -> " + str1 + " ; " + str2);

            }

        };

        AFuncInt lambda = (str) -> System.out.println("Lambda -> " + str);
        AFuncInt.print("Hello");
        f.print("Hello", "World");
        f.apply("Nuraddin");

        System.out.println("Anything..................Anything");

        lambda.print("Hello", "World");
        lambda.apply("Nuraddin");

    }
}
