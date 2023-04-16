import java.util.Optional;

public class PracticeFuntionalInterfaces {
    public static void main(String[] args) {
        AFuncInt a = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println(s);
            }
        };
        a.apply("Hello");
        AFuncInt.print("Hello");
        a.print("Hello", "World");
        AFuncInt a2 = (s) -> System.out.println(s);
        a2.apply("Hello");
        AFuncInt.print("Hello");
        a2.print("Hello", "World");
    }
}

interface AFuncInt {
    void apply(String s);
    static void print(String s) {
        System.out.println(s);
    }
    default void print(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}
