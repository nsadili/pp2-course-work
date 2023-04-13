public interface AFuncInt{
    void apply(String s);

    static void print(String s){
        System.out.println(s);
    }

    default void print(String s, String s1){
        System.out.println(s + " " + s1);
    }
}

