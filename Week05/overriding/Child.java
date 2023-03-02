package overriding;

public class Child extends Parent {
    public static int calcValue(int a, int b) {
        System.out.println("Subclass");
        return (a + b) * 2;
    }
}
