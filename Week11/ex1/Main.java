package ex1;

public class Main {
    public static void main(String[] args) {
        
        AFuncInt func = new AFuncInt() {
            @Override
            public void Apply(String str) {
                System.out.println("Anon " + str);
            }
        };

        func.Apply("Programming");
        AFuncInt.Print("Programming");
        func.Print("Programming", "Principles");

        AFuncInt lambda = (str) -> System.out.println("Lambda -> " + str);
        lambda.Apply("Hello");
        lambda.Print("Hello", "World");
    }
}
