package ex1;

public class Main {
    
    public static void main(String[] args) {
        
        AFuncInt function = new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("ANONYMOUS -> " + str);
            }

            @Override
            public void print(String str1, String str2) {
                System.out.println("OVERRIDEN -> " + str1 + " ; " + str2);
           }
        };

             function.apply("Present");   
            AFuncInt.print("Present");
            function.print("Present", "Book");

       AFuncInt lambda = (str) -> System.out.println("LAMBDA -> " + str);

       lambda.apply("Arsenal");
       lambda.print("Arsenal", "fan");
    }
    
}