package ex1;
public interface AFuncInt{

    void apply (String str);

    static void print(String str){

        System.out.println("Ststic > " + str);

    }

    default void print(String str1, String str2 ){



    System.out.println("Deafult > " + str1 + " " + str2);


    }

    

}