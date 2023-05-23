package Week11;

public class Practice {

 interface AFuncInt  {

    void apply (String str);
    
    static void print(String str) {
       
        System.out.println(str);

    }
 

    default void print(String str1, String str2) {

        System.out.println(str1+" "+str2);
    }
 }

 public static void main(String args[]) {
    
    AFuncInt printMessage1 = message -> System.out.println(message);
    printMessage1.apply("Hello");

    AFuncInt.print("Hello");
    printMessage1.print("hello", "Hi");

 }

}
