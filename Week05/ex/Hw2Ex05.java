class A {  // superclass

    static { 
        System.out.println("In static init block of A");    // 1st
     }

    public A() {
         System.out.println("In constructor A.");           // 4th
         }

    {
         System.out.println("In instance init block of A");   // 3rd
    }

   }


   class B extends A {  // subclass
    
    static { 
        System.out.println("In static init block of B");   // 2nd
    }

    public B() { 
        System.out.println("In constructor B.");           // 6th
    }

    { 
        System.out.println("In instance init block of B");   // 5th
    }

   }


   public class Hw2Ex05 {
    public static void main(String[] args) {

    B b = new B();

    }

   }