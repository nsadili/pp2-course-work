package Week05.ex;

public class Ex3 {
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

/////////////
/*
 Description:

 Answers:
 Super
 10
 Subclass
 30

Because the main method of the OverrideDemo class
creates an instance of the Child class using the new keyword.
When the calcValue method is called on this instance with a single argument 5, 
It invokes the implementation of calcValue defined in the Parent class because Child does not have a matching method signature for calcValue(int a).
 */
