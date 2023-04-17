package Week11;
@FunctionalInterface
public interface AFuncInt {

    void apply(String str);

    static void print(String str) {
        System.out.println("static print:" + str);
    }

    default void print(String str1, String str2) {
        System.out.println("default print:" + str1 + " <==> " + str2);
    }

    public static void main(String[] args) {

        AFuncInt f = new AFuncInt() {
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);
            }
        };

        AFuncInt lambda = str -> System.out.println("Lambda -> " + str);

        AFuncInt.print("hello");

        f.print("Hello", "World");

        f.apply("Leyla");

        System.out.println("---------");

        lambda.print("Hello", "World");

        lambda.apply("Leyla");

    }
}
