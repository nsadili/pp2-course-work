package Week11.ex.ex1;

public class AFuncIntClass {
    public static void main(String[] args) {
        AFuncInt f1 = new AFuncInt() {
            @Override
            public void apply(String s) {
                System.out.println("Anonymous 'apply': " + s);
            }
        };
        AFuncInt.print("Hello");
        f1.print("Hi", "Hello");
        f1.apply("Hey");

        AFuncInt f2 = s -> System.out.println("Lambda 'apply': " + s);
        f2.apply("Hello World");
        f2.print("Hello", "World");
    }
}