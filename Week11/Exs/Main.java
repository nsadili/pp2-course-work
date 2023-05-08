package Exs;

public class Main {
    public static void main(String[] args) {
        AFuncInt f= new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymous -> " + str);

                
            }
            
            
            
        };


       AFuncInt.print("Hello");
        f.print("Hello", "world");
        f.apply("Nilufar");
        System.out.println("=====================================");


        AFuncInt lambda = (str) -> System.out.println("Lambda -> "+str);
        AFuncInt.print("Hello");
        lambda.print("Hello", "world");
        lambda.apply("Jalala");

        
    }
    
}
