package Week11;

public interface AFuncInt{
    void apply(String str);

    static void print(String str){
        System.out.println("Static ==>" + str);
    }

    default void print(String str1, String str2){
        System.out.println("Default ==>" + str1 + " " + str2 );
    }

    
}


