package week05;

public class Exercise1 {

    /*
     * Output:
     *
     * In constructor X.
     * In constructor Y.
     *
     * Since Y extends X, the constructor of X is called first.
     * After the X constructor completes execution, the constructor of Y is called.
     * So, the output consists of both the messages printed by the X and Y constructors.
     */
    public static void main(String[] args) {
        Y y = new Y();
    }
}

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
