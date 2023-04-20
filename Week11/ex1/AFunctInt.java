package ex1;

public interface AFunctInt{

    void apply(String str);

    static void print(String str){
        System.out.println("Static+-->"+str);
    }

    default void print(String str1,String str2){
          System.out.println("Defualt+-->"+str1+""+str2);
    }



}