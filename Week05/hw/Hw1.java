package Week05.hw;

public class Hw1 {
   public static void main(String[] args){
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
        Y y = new Y();
        }
       }
   }
      
}

/////////////////////
/* 
 Description:

 Answer:
 In constructor X.
 In constructor Y.

 This is because the main method of the Main class creates an instance of the Y class using the new keyword. 
 Then the Y class extends the X class, when an instance of Y is created
 The constructor of the X class is called first, which prints "In constructor X.".
 In the end the constructor of the Y class is called, which prints "In constructor Y.".
*/
