package ex1;

public class Main {

    public static void main(String[] args) {
        
        AFuncInt f = new AFuncInt() {
           public void apply(String str){
                    System.out.println("Anonymous ---> " + str);
            }
        };

        

        AFuncInt lambda= str -> System.out.println("Lambda ---> " +str);

        AFuncInt.print("HELLO");
        f.print("HELLO" , "WORLD");
        f.apply("BAHRUZ");
        System.out.println("-----");

        lambda.print("HELLO" , "WORLD");
        lambda.apply("BAHRUZ");

    }
}