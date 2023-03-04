public class NestedDemo {        
    
    class InnerClass {

    {
    System.out.println("InnerClass - init");  // instance initializer
    }

     static {
        System.out.println("StaticNestedClass_inner - static init"); // static init
     } 

      // cannot have static initializer

    }

    static class StaticNestedClass {

    {
    System.out.println("StaticNestedClass - init"); // instance init
    }

    static {
    System.out.println("StaticNestedClass - static init"); // static init
    }

    }

    }
    