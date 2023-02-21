public class Exercise_3 {
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
    
    //the result will be "Super 10 SubClass 30". Why is it so? 
    //In our code Child is considered as a subclass, so Parent will a super one
    //It means that if we say to our code to consider {5}, it will relate to Parent. That's why firtsly we got Super and {10}
    //Second integers are {5} and {10}, which means that both of them will relate to "second class", which is class Child, and other stuff
    //like "Subclass" and "30" will be printed 