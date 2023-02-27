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
        
 // Output : Super
//              10
//             Subclass 
//              30
/* 
 The example shows overriding in java. A method provided by the parent class is implemented by child class. In this case, the calcValue function in the Child class has a different signature than in the Parent class and is provided independently by the Child class.

 */