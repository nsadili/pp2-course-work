class A {
    static { System.out.println("In static init block of A"); }

    public A() { System.out.println("In constructor A"); }
    { System.out.println("In instance init block of A"); }
}

class B extends A {
    static { System.out.println("In static init block of B"); }

    public B() { System.out.println("In constructor B."); }

    { System.out.println("In instance init block of B"); }
}

public class Main2 {
    public static void main(String[] args) {
        B b =new B();
    }
}
 /*
  * If you make a variable static
  * it means that it will be the sae for the all objects
  */