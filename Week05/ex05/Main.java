class X {
    public X() {
System.out.println("In constructor X."); }
}
class Y extends X {
    public Y() {
System.out.println("In constructor Y."); }
}
public class Main {
public static void main(String[] args) {
Y y = new Y(); 
}
}

/*
 * there are 3 class:
 * firstly, class X with the consutructor that prints "In constructor X."
 * secondly, class Y, which is the subclass of the superclass X,
 * has the constructor that prints "In constructor Y."
 * finally, class Main has a main method that creates an object of class Y
 * and can call both of the constructors from class Y in order.
 */