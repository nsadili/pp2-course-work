package Week11.Ex1;

public class Main {
    public static void main(String[] args) {
        AFuncInt af = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("Anonymous: "+str);
            } 
        };

        AFuncInt lam = str -> System.out.println("Lambda: "+str);
        lam.apply("Hello World");

        // AFuncInt.print("Hello world.");
        // af.print("Good", "Morning");
        // af.apply("Rufat Hajizada");
    }
}
