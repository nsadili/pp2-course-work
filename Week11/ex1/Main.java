package Week11.ex1;

public class Main {
    public static void main(String[] args) {

        AFunctInt f = new AFunctInt() {

            public void apply(String str) {
                System.out.println("ANONYMOUS -> " + str);
            }  
        };


        AFunctInt lambda = s -> System.out.println("Lambda -> " + s); 

        AFunctInt.print("Hello");
        f.print("Hello", "World");
        f.apply("smt");
       
        lambda.print("Hello", "World");
        lambda.apply("smt");
    }
}
