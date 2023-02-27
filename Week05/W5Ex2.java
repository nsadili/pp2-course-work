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

   public class W5Ex2 {
    public static void main(String[] args) {
    B b = new B();
    }
   }

   /*The output of the code is easy to predict because all classes and methods are
    declared as public. Therefore, everything will be printed. The class hierarchy 
    consists of class A and class B, with B depending on A. It is interesting to note 
    that removing the "public class Exercise" line would not affect the output of the code,
    as there are no "println" statements that depend on it. */
