package ex1;

public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt() {
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }

            public void print(String str1, String str2) { 
                    System.out.println("OVERRIDDEN - > " + str1 + " <==> " + str2);
                }
        };


        AFuncInt lambda = (str) -> System.out.println("Lambda -> " + str);

        AFuncInt.print("Hello");
        f.print("Hello", "World");
        f.apply("Farid");

        System.out.println("===========================");

        lambda.print("Hello", "World");
        lambda.apply("Farid");

    }
}
