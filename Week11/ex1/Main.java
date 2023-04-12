package Week11.ex1;

public class Main {
    public static void main(String[] args) {
        AFuncInt f= new AFuncInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymous " + str);
            }
            
        };

        AFuncInt lambda= (str) -> System.out.println("Lambda -> "+str);
      
        AFuncInt.print("Hello");
        f.print("Hello", "World");
        f.apply("name");

        lambda.print("Hello", "World");
        lambda.apply("name");


    }
}
