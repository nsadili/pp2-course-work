public class OverrideDemo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.calcValue(6));
        System.out.println(child.calcValue(6, 11));
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
 //             12
//             Subclass 
//              34
/* Why: That example shows overriding in java. A method that is already given by the parent class is implemented by the child class.
 In this instance, the calcValue function has a different signature in the Child class than it does in the Parent class and is provided by the Child class independently.
 */
