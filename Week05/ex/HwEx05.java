    class X {
        public X() {
        System.out.println("In constructor X.");
        }
       }
       class Y extends X {
        public Y() {
        System.out.println("In constructor Y.");
        }
       }
       public class HwEx05 {
        public static void main(String[] args) {
        Y y = new Y();
        }
       }
       
