public class Ex2 {
  class A {
    // static {
    // System.out.println("In static init block of A");
    // }

    public A() {
      System.out.println("In constructor A.");
    }

    {
      System.out.println("In instance init block of A");
    }
  }

  class B extends A {
    // static {
    // System.out.println("In static init block of B");
    // }

    public B() {
      System.out.println("In constructor B.");
    }

    {
      System.out.println("In instance init block of B");
    }
  }

  public static class Main2 {
    public static void main(String[] args) {
      // B b = new B();
    }
  }
}

// Output:
// In static init block of A
// In instance init block of A
// In constructor A.
// In static init block of B
// In instance init block of B
// In constructor B.
