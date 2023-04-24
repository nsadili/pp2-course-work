import java.util.Optional;

@FunctionalInterface
interface AFuncInt {
    void apply(String str);

    static void print(String str) {
        System.out.println(str);
    }

    default void print(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }

    default boolean isSameLength(String str1, String str2) {
        return str1.length() == str2.length();
    }
}

public class Main {
    public static void main(String[] args) {

        AFuncInt anonInstance = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("Applying Anonymous class with " + str);
            }
        };
        anonInstance.apply("Anonymous Class");
        AFuncInt.print("Hello World");
        anonInstance.print("Hello", "World");
        boolean sameLength = anonInstance.isSameLength("Hello", "Java");
        System.out.println("Is same length: " + sameLength);

        AFuncInt lambdaInstance = str -> System.out.println("Applying Lambda with " + str);
        lambdaInstance.apply("Lambda Expression");
        AFuncInt.print("Hello Java");
        lambdaInstance.print("Hello", "Java");
        sameLength = lambdaInstance.isSameLength("Java", "World");
        System.out.println("Is same length: " + sameLength);

        Optional<String> optionalString = Optional.of("Hello Optional");
        optionalString.ifPresent(System.out::println);
    }
}