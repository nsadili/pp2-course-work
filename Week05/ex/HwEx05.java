class X {
    public X() {     // parent class --> super class
    System.out.println("In constructor X.");
    }
   }
   class Y extends X {    // Y --> X  ;   child class  -->  sub class
    public Y() {
    System.out.println("In constructor Y.");
    }
   }
   public class HwEx05 {
    public static void main(String[] args) {
      
        Y y = new Y(); 
        X x = new X();
        
    }
   }