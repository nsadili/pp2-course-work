package overriding;

public class Parent {
    public static int calcValue(int a, int b) {
        System.out.println("Super");
        return (a + b);
    }
}
