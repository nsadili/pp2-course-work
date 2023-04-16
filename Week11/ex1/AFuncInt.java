package ex1;
public interface AFuncInt {
    void Apply(String str);
    
    static void Print(String str) {
        System.out.println("Static -> "  + str);
    }

    default void Print(String str1, String str2) {
        System.out.println("Default -> "  + str1 + " " + str2);
    }

    
}