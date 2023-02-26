public class Ex4 {
    class A {
      // static {
      // System.out.println("AS");
      // }
      {
        System.out.println("A");
      }
  
      public A() {
        System.out.println("AC");
      }
  
      public A(int x) {
        System.out.println(x + " AC");
      }
    }
  
    class GeneralType extends A {
      // static {
      // System.out.println("GTS");
      // }
      {
        System.out.println("GT");
      }
  
      public GeneralType() {
        super(5);
        System.out.println("GTC");
      }
    }
  }
  
  // AS
  // GTS
  // 5 AC
  // GT
  // GTC