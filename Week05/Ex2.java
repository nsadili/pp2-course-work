package Week05;

public class Ex2 {
    
    class A {
 static { System.out.println("In static init block of A"); }
 public A() { System.out.println("In constructor A."); }
 { System.out.println("In instance init block of A"); }
}
class B extends A {
 static { System.out.println("In static init block of B"); }
 public B() { System.out.println("In constructor B."); }
 { System.out.println("In instance init block of B"); }
}
public class Main2 {
 public static void main(String[] args) {
 B b = new B();
 }
}
}

// I think the first static block will be output.
// Since is determined at compile-time, based on the type of the reference variable or expression used to make the call.
// Then, the instance initialization blocks of A and B are executed, also in that order. 
// Finally, the constructors of A and B are executed, again in order.