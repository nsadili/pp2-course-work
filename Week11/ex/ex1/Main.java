package ex1;

public class Main {
    public static void main(String[] args) {
        
        AFuncInt func = new  AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("Anonymous ->" + str );
            }
        };
        // func.apply("Programming");
        //AFuncInt.print("Programming");
        //func.print("Programming", "Principles");
      
        AFuncInt  lambda = s -> System.out.println("Lambda ->" +s);

        lambda.apply("Hello");
        lambda.print("Hello", "World");
    }
}
