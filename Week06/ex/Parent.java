public class Parent {
    public int calcValue(int a, int b) {
        System.out.println("Superclass");
        return 1;
    }
}

class Child extends Parent {
    @Override
    public int calcValue(int a, int b) {
        System.out.println("Subclass");
        return 2;
    }

    public void someMethod() {
        System.out.println("The New Method");
    }
}
