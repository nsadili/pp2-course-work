package Week11.ex.ex1;

public interface AFuncInt {
    void apply(String s);

    static void print(String s) {
        System.out.println("static -> " + s);
    }

    default void print(String s1, String s2) {
        System.out.println("default -> " + s1 + " ; " + s2);
    }
}
