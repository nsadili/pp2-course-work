package Week05;

public class Ex3 {
    public class OverrideDemo {
        public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.calcValue(5));
        System.out.println(child.calcValue(5, 10));
        }
        }
        class Parent {
        public int calcValue(int a) {
        System.out.println("Super");
        return a * 2;
        }
        }
        class Child extends Parent {
        public int calcValue(int a, int b) {
        System.out.println("Subclass");
        return (a + b) * 2;
        }
        }
}

// The output of the code would be: Super 10 Subclass 30
// This is because the Child class inherits the calcValue method from its parent Parent class, but also provides its own implementation of the method with an additional parameter.
// The first call to child.calcValue(5) only matches the method in the parent class, so it prints "Super" and returns 5 * 2 = 10.
// The second call to child.calcValue(5, 10) matches the method in the child class, so it prints "Subclass" and returns (5 + 10) * 2 = 30.

