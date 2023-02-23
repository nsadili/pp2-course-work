package Week05;

public class Ex1 {
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

// The output of the code would be: In constructor X. In constructor Y.
// This is because the code defines two classes, X and Y, where Y is a subclass of X. 
// However, before the constructor of Y is executed, the constructor of X is called first, since Y extends X. 
// Therefore, the output displays the message from the constructor of X followed by the message from the constructor of Y.
