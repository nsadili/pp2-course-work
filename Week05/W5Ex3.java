public class W5Ex3 {
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
    
    /*The output of the code will be "Super 10 SubClass 30". This is because the class Child
     is a subclass of Parent, so Parent is the super class. When we pass the integer {10}, 
     it relates to Parent and we get "Super" and {10} printed. The second integer is {5} and {10}, 
    which both relate to class Child, so the output will include "Subclass" and {30}. */
