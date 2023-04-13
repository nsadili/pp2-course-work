package ex1;


public class Main {
     public static void main(String[] args) {

        AFuncInt f=new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("ANONYMOUS: "+str);
            }
        };

        f.apply("Hello");
        AFuncInt.print("Hello");
        f.print("Hello", "World");

        AFuncInt d= str -> System.out.println(str);

        d.apply("Ulvi's");
        d.print("Default:", "Hello");
        AFuncInt.print("Static");
     }
}
