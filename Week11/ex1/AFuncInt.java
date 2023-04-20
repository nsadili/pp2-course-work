package ex1;

@FunctionalInterface
public interface AFuncInt {

    void apply(String str);

    static void print(String str){
        System.out.println("static print:" + str);
    }

    default void print(String str1, String str2){
        System.out.println("default print:" + str1 + " <==> " + str2);
    }
}