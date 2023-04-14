package ex1;

public class Main {
    public static void main(String[] args) {
    //    AFuncInt func= new AFuncInt() {

    //     @Override
    //     public void apply(String str) {
    //       System.out.println("Anonymous class->"+str);
    //     }

    //     @Override
    //     public void print(String str1, String str2) {
    //      System.out.println("Overriden-->"+str1+str2);
    //     }
        
    //    };
    AFuncInt func = (str)->System.out.println("Lambda expression "+str);

       func.apply("Hello");
       func.print("Hello ", "World!");
       AFuncInt.print("Hello!");
    }

   
    
}
