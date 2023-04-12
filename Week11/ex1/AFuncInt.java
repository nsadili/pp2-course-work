package ex1;

public interface AFuncInt {
    void apply(String str);

    static void print(String str) {
        System.out.println("STATIC -> " + str);
    }

    default void print(String str1, String str2) {
        System.out.println("DEFAULT -> " + str1 + " <==> " + str2);
    }
}