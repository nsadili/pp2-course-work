public class Hw3Ex05 {
    public static void main(String[] args) {

    Child child = new Child();

    System.out.println(child.calcValue(5));
    System.out.println(child.calcValue(5, 10));

    }

    }


    class Parent {       // superclass

    public int calcValue(int a) {

    System.out.println("Superclass");

    return a * 2;                      // 1) 10
    }

    }


    class Child extends Parent {   // subclass

    public int calcValue(int a, int b) {

    System.out.println("Subclass");
    return (a + b) * 2;                            // 2) 30
    }

    }
    