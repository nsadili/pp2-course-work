@FunctionalInterface
public interface AFuncInt {
    void apply(String str);

    static void print(String str) {
        System.out.println(str);
    }

    default void print(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }
}
