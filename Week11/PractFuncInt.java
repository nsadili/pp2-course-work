package Week11;

public interface PractFuncInt {
    void apply(String s);

    static void print(String s){
        System.out.println(s);
    }
    
    default void print(String s1, String s2){
        System.out.println(s1 + " " + s2);

    }
}
