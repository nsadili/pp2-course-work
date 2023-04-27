class X {
    public X() {
    System.out.println("In constructor X.");
    }
   }
   class Y extends X {
    public Y() {
    System.out.println("In constructor X.");
    }
   }
   public class hw1 {
    public static void main(String[] args) {
    Y y = new Y();  // In constructor X. In constructor Y.
    }
   }