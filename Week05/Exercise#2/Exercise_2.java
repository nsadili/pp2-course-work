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

   public class Exercise_2 {
    public static void main(String[] args) {
    B b = new B();
    }
   }

   //It is easy to predict the result, because there're "public" written everwhere. So everything will be printed. 
   //Let's write an ierarchy, so class A --> class B. So B depends on A
   //Also there's an interesting note to point out - if we remove public class Exercise nothing will be changed, the output will be the same
   //because there's no any "println"