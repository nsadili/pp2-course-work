package HW;

public class hw01 {
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
       public class Main {
        public static void main(String[] args) {
        // Y y = new Y();
        }
       }   
       
       /*Output can be :  In constructor X.
                          In constructor Y. */


         //* Y class extends the X class,
         // the constructor of X class is called first, and it prints the message "In constructor X."*/
         //

       
}
