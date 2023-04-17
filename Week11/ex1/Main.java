package Week11.ex1;

public class Main {
    public static void main(String[] args) {
        AFuncInt f = new AFuncInt () {
            @Override
            public void apply(String str) {
            System.out.println("ANONYMOUS -> " + str);
            }
        };    
        f.apply("Hello");
        AFuncInt.print("Hello1");
        f.print("Hello1","Hello2");
        AFuncInt lambda = (str) -> System.out.println("LAMBDA -> "+ str);
        lambda.apply("fare");
        lambda.print("fareware", "mew");
    }
}
